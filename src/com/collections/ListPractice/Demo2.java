package com.collections.ListPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Demo2 {

	public static void main(String[] args) {
		List<Integer> list = new Vector<>(Arrays.asList(1, 2, 3));
		//list.get(3);//indexOutOfBoundsException0
		list.add(3,5);
		System.out.println(list);
		

	}

}
