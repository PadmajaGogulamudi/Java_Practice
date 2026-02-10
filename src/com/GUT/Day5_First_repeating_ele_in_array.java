package com.GUT;

import java.util.LinkedHashMap;
import java.util.Map;

public class Day5_First_repeating_ele_in_array {

	public static void main(String[] args) {
		int[] arr = { 10,1, 2, 3, 1, 4, 5, 2, 4 };
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		boolean flag=true;
		for(Map.Entry<Integer, Integer> e:map.entrySet()){
			if(e.getValue()>1) {
				flag=false;
			System.out.println(e.getKey());
			break;
			}
		}
		if(flag)
			System.out.println("no  repeating ele!!");
		
		
		}

}
