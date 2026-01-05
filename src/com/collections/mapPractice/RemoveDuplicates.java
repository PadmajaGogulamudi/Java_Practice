package com.collections.mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr=new int[] {1, 2, 3, 2, 4, 1, 5,5,5,5,10};
		Map<Integer,String> map=new LinkedHashMap<>();
		for(int i:arr) {
			map.put(i, "yesss");
		}
		//printing values
		for(Integer k:map.keySet()) {
			System.out.println(k);
		}
		
	}

}
