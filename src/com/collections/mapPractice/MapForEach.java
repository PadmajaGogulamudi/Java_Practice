package com.collections.mapPractice;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {

	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1, null);
		map.put(3, 8);
		map.forEach((k,v)->System.out.println(k+" : "+v));

	}

}
