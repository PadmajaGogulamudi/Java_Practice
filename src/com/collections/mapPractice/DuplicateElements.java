package com.collections.mapPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 3, 4, 5 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> itr : map.entrySet()) {
			if (itr.getValue() > 1)
				System.out.println(itr.getKey() + " : " + itr.getValue());
		}

	}

}
