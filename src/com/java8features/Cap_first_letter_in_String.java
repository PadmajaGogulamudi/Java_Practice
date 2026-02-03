package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cap_first_letter_in_String {

	public static void main(String[] args) {
		String s = "java is not simple";
		String[] arr = s.split(" ");
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		list.stream().map(n -> ((n.charAt(0) + "").toUpperCase()) + n.substring(1) + " ").forEach(System.out::print);
		
		
		List<Integer> l1=	new ArrayList<>(Arrays.asList(1,2,3));
		
		List<Integer> l2=	new ArrayList<>();
		
		// int n =l1.stream().map(n->l2.add(n*n*n)).reduce(n->0);

	}

}
 