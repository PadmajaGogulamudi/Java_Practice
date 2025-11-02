package collections;

import java.util.*; // Import Collection and ArrayList

public class CollectionMethodsDemo {
	public static void main(String[] args) {

		// Create Collection reference and ArrayList object
//        Collection<Integer> numbers = new ArrayList<>();
//
//        // 1. add() – Add elements
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(40);
//
//        System.out.println("Numbers: " + numbers);
//
//        // 2. size() – Find total elements
//        System.out.println("Size: " + numbers.size());
//
//        // 3. contains() – Check if element exists
//        System.out.println("Contains 20? " + numbers.contains(20));
//
//        // 4. remove() – Remove an element
//       System.out.println(numbers.remove(30)); 
//        System.out.println("After removing 30: " + numbers);
//
//        
//        // 5. Iterate using Iterator
//        System.out.println("Iterating elements:");
//        Iterator<Integer> itr = numbers.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//
//        // 6. addAll() – Add elements from another collection
//        Collection<Integer> extra = new ArrayList<>();
//        extra.add(50);
//        extra.add(40);
//        extra.add(60);
//        numbers.addAll(extra);
//        System.out.println("After addAll(): " + numbers);
//        numbers.retainAll(extra);
//        System.out.println("After retainAll(): " + numbers);
//
//        
//        
//
//        // 7. removeAll() – Remove all elements from another collection
//        numbers.removeAll(extra);
//        System.out.println("After removeAll(): " + numbers);
//
//        // 8. clear() – Remove all elements
//        numbers.clear();
//        System.out.println("After clear(): " + numbers);
//
//        // 9. isEmpty() – Check if collection is empty
//        System.out.println("Is empty? " + numbers.isEmpty());
		Collection<Integer> numbers = new ArrayList<>();

		// 1. add() – Add elements
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println();
		Collection<Integer> extra = new ArrayList<>();
		extra.add(50);
		extra.add(40);
		extra.add(60);
		numbers.retainAll(extra);
		System.out.println("After retainAll(): " + numbers);

	}
}
