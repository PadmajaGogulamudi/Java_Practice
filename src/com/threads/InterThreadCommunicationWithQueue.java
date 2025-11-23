package com.threads;

import java.util.LinkedList;
import java.util.Queue;

class BoundedQueue<T> {
    private final Queue<T> queue = new LinkedList<>();
    private final int capacity;

    public BoundedQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void put(T item) throws InterruptedException {
        while (queue.size() == capacity) {   // wait while full
            wait();
        }
        queue.offer(item);
        System.out.println(Thread.currentThread().getName() + " put: " + item);
        notifyAll(); // wake up waiting consumers/producers
    }

    public synchronized T take() throws InterruptedException {
        while (queue.isEmpty()) {            // wait while empty
            wait();
        }
        T item = queue.poll();
        System.out.println(Thread.currentThread().getName() + " took: " + item);
        notifyAll(); // wake up waiting producers/consumers
        return item;
    }
}

// Producer that produces a limited number of items (for demo)
class Producer implements Runnable {
    private final BoundedQueue<Integer> queue;
    private final int start;
    private final int count; // how many items to produce

    public Producer(BoundedQueue<Integer> queue, int start, int count) {
        this.queue = queue;
        this.start = start;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                queue.put(start + i);
                Thread.sleep(100); // simulate work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

// Consumer that consumes until it has consumed `count` items (for demo)
class Consumer implements Runnable {
    private final BoundedQueue<Integer> queue;
    private final int count; // how many items to consume

    public Consumer(BoundedQueue<Integer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                Integer item = queue.take();
                // process item
                Thread.sleep(150); // simulate processing
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class InterThreadCommunicationWithQueue {
    public static void main(String[] args) throws InterruptedException {
        int queueCapacity = 5;
        BoundedQueue<Integer> queue = new BoundedQueue<>(queueCapacity);

        // configuration
        int producers = 3;
        int consumers = 2;
        int itemsPerProducer = 10; // each producer will produce 10 items
        int itemsPerConsumer = (producers * itemsPerProducer) / consumers; // divide work

        Thread[] producerThreads = new Thread[producers];
        Thread[] consumerThreads = new Thread[consumers];

        // start producers
        for (int i = 0; i < producers; i++) {
            Producer p = new Producer(queue, i * itemsPerProducer, itemsPerProducer);
            Thread t = new Thread(p, "Producer-" + (i + 1));
            producerThreads[i] = t;
            t.start();
        }

        // start consumers
        for (int i = 0; i < consumers; i++) {
            Consumer c = new Consumer(queue, itemsPerConsumer);
            Thread t = new Thread(c, "Consumer-" + (i + 1));
            consumerThreads[i] = t;
            t.start();
        }

        // wait for all to finish (demo)
        for (Thread t : producerThreads) t.join();
        for (Thread t : consumerThreads) t.join();

        System.out.println("All producers and consumers have finished.");
    }
}
