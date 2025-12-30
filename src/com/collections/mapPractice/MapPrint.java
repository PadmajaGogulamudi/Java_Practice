package com.collections.mapPractice;

import java.util.HashMap;
import java.util.Map;

public class MapPrint {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, null);
		map.put(2, 4);
		map.put(3,0);
		map.put(3, null);
		map.put(null, null);
		for(Map.Entry<Integer, Integer> itr:map.entrySet()) {
			System.out.println(itr.getKey()+" : "+itr.getValue());
		}
		
		
	}

}
