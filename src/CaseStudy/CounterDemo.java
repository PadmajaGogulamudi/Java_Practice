package CaseStudy;
// Shared Counter Class
class SharedCounter {
    private int count = 0;
    private final int MAX_LIMIT;

    public SharedCounter(int max) {
        this.MAX_LIMIT = max;
    }

    // Increment with wait() and notifyAll()
    public synchronized void increment() throws InterruptedException {
        while (count == MAX_LIMIT) {
            System.out.println(Thread.currentThread().getName() 
                               + " waiting: Counter at MAX (" + count + ")");
            wait();  // wait until someone decreases the counter
        }

        count++;
        System.out.println(Thread.currentThread().getName() + " incremented -> " + count);

        notifyAll();  // notify other threads that counter changed
    }

    // Decrement with wait()/notifyAll()
    public synchronized void decrement() throws InterruptedException {
        while (count == 0) {
            System.out.println(Thread.currentThread().getName() 
                               + " waiting: Counter at 0");
            wait();  // wait until someone increments
        }

        count--;
        System.out.println(Thread.currentThread().getName() + " decremented -> " + count);

        notifyAll();  // notify waiting increment threads
    }

    public synchronized int getCount() {
        return count;
    }
}


// Worker Thread for incrementing
class IncrementThread extends Thread {
    private SharedCounter counter;

    public IncrementThread(SharedCounter counter, String name) {
        super(name);
        this.counter = counter;
    }

    public void run() {
        try {
            for (int i = 0; i < 7; i++) {   // try increment multiple times
                counter.increment();
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


// Worker Thread for decrementing
class DecrementThread extends Thread {
    private SharedCounter counter;

    public DecrementThread(SharedCounter counter, String name) {
        super(name);
        this.counter = counter;
    }

    public void run() {
        try {
            for (int i = 0; i < 7; i++) {   // try decrement multiple times
                counter.decrement();
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


// Main class
public class CounterDemo {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter(3);  // MAX LIMIT = 3

        Thread t1 = new IncrementThread(counter, "Incrementer-1");
        Thread t2 = new IncrementThread(counter, "Incrementer-2");
        Thread t3 = new DecrementThread(counter, "Decrementer-1");

        t1.start();
        t2.start();
        t3.start();
    }
}
