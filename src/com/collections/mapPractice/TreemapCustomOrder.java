package com.collections.mapPractice;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreemapCustomOrder {

	public static void main(String[] args) {
		Map<Integer, String> students = new TreeMap<>(Collections.reverseOrder());
		students.put(101, "paddu");
		students.put(99, "reddy");
		students.put(120, "xyz");
		students.put(89, "sheethal");
		System.out.println(students);

		

	}

}
