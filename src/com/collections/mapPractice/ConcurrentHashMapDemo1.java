package com.collections.mapPractice;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//add eles while iterating(no exception) java.util.ConcurrentModificationException
//concurrentHashMap is thread safe Map
public class ConcurrentHashMapDemo1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new ConcurrentHashMap<>();
		map.put(1,"A");
		map.put(2, "B");
		map.put(2, null);
//		map.put(null, null);
//		map.put(null, "a");
		for(Integer k:map.keySet()) {
			map.put(6, "B");
		}
		System.out.println(map);

	}

}
