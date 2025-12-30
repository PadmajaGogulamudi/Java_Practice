package com.collections.mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypesDemo {

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		int[] keys = { 8, 9, 1 };
		for(int k:keys) {
			hashmap.put(k, "Val" + k);
			linkedHashMap.put(k, "Val" + k);
			treeMap.put(k, "Val" + k);
		}
		System.out.println(hashmap+"\n"+linkedHashMap+"\n"+treeMap);

	}

}
