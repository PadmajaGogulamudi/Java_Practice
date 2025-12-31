package com.collections.ListPractice;

import java.util.Enumeration;
import java.util.Vector;

public class ArrayListFailFastBehaviour {
	public static void main(String[] args) {
//	List<String> list = new ArrayList<>();
//	list.add("A");
//	list.add("B");
//	list.add("C");
//	list.add("D");
//
//	for (String s : list) {
//	    if (s.equals("C")) {
//	        list.remove(s);
//	    }
//	}
		// System.out.println(list);
		// ******************************
//	List<Integer> list = new LinkedList<>();
//	list.add(10);
//	list.add(20);
//	list.add(30);
//
//	for (Integer i : list) {
//	    list.add(40);
//	}
		// System.out.println(list);
//**************************************
//		Vector<String> v = new Vector<>();
//		v.add("A");
//		v.add("B");
//		v.add("C");
//
//		ListIterator<String> it = v.listIterator();
//		while (it.hasNext()) {
//			it.next();
//			it.add("D");
//		}
//		
////		for(int i=0;i<v.size();i++) {
////			
////			v.add("D");
////		}
//
//		System.out.println(v);
		Vector<String> v = new Vector<>();
		v.add("A");
		v.add("B");

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
		    String s = e.nextElement();
		    v.add("C");
		}
	System.out.println(v);



	}
}
