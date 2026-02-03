package com.collections.mapPractice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

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
		
		System.out.println("##################");
		
		Set<Integer> set=new HashSet<>();
		//set.addAll(Arrays.asList(arr));
		for(int i:arr) {
			if(set.add(i)) {
				System.out.println(i );
			}
		}
		
	}

}
