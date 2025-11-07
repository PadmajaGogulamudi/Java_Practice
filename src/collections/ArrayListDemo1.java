package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List<Integer> al1 = new LinkedList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		/*
		 * iterator is uiversal cursor to work with elements in collections one after
		 * another we use iterator. listIterator will work only for list
		 * 
		 * crud create,retrive,update,delete collections are used to displays the data
		 * from database to user interface in a structured mannaer use the collection
		 * objects based on the requirement of CRUD operations wether you are displaying
		 * the data from UI to database or retriving the data from database and
		 * -displayes it in UI or performing CRUD operations on - database we have
		 * select the collections objects which is suitable in order to perform well and
		 * saves the memory and time.
		 */

		/*
		 * ArrayList is fast in retrival because it internally implements RandomAccess
		 * interface it randomly access the elements (marker interface used by the list
		 * implementations to indicate that they supports the fast random access ).
		 * 
		 */
		// System.out.println(al1);
//		Iterator<Integer> itr = al1.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		ListIterator<Integer> litr = al1.listIterator();
		System.out.println("**************************");
		
		while (litr.hasNext()) {
			
			System.out.println(litr.next());
		}

		System.out.println("**************************");

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}
