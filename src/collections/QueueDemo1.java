package collections;


import java.util.Comparator;

//add,offer = adding
//peek = just return the head ele,(poll,remove )=return removing ele
//contains(ele) = checks if the ele is present int the queue
//Comparator.reverseOrder() to reverse the priority
//clear() to empty the queue

import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		// internally uses an array which is Object Type
		PriorityQueue<Integer> pq = new PriorityQueue<>();//default capacity for priorityQueue is 11

		pq.add(3);
		pq.add(0);
		pq.offer(1);
		pq.add(0);
		pq.add(0);// head pointing to least (priority ) values

		pq.add(2);
		// pq.add(null); queue does not allow null vaues allow duplicates

		pq.add(6);
		System.out.println(pq);
		System.out.println(pq.poll());
		// poll removes ele when queue is empty it returns null whereas remove throws an
		// exception when uesd on empty queue

		System.out.println(pq.peek());
		System.out.println(pq.poll());// get the head (priority ele)
		System.out.println(pq.poll());// removes the head (prority ele)
		System.out.println(pq.poll());

		System.out.println(pq);
		System.out.println("**********************");
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		System.out.println(pq1.add(4));
		System.out.println(pq1.offer(0));

		System.out.println(pq1.add(3));

		System.out.println(pq1.remove());
		System.out.println(pq1);
		System.out.println(pq1.contains(3));
		while (!pq1.isEmpty()) {
			// System.out.println(pq1.peek()); for every iteration peek value will be same
			// so it will get into infinite loop
			System.out.println(pq1.poll());
		}
		//pq1.clear();
		System.out.println(pq1);

	}

}
