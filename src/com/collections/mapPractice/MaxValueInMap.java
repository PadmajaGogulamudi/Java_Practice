package com.collections.mapPractice;

import java.util.HashMap;
import java.util.Map;

public class MaxValueInMap {

	public static void main(String[] args) {
		Map<Character,Integer> map=new HashMap<>();
		//map.put('a', null); //gives null pointer exception
		map.put('b', 2);
		map.put('c', 1);
		int max=Integer.MIN_VALUE;
		for(Integer i:map.values()) {
			if(i>max)
				max=i;
		}
		System.out.println("max value is : "+max);
	}

}
