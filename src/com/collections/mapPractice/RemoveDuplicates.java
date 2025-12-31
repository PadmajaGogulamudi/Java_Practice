package com.collections.mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr=new int[] {1, 2, 3, 2, 4, 1, 5};
		Map<Integer,Boolean> map=new LinkedHashMap<>();
		for(int i:arr) {
			map.put(i, true);
		}
		//printing values
		for(Integer k:map.keySet()) {
			System.out.println(k);
		}
	}

}
