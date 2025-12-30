package com.collections.mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {

	public static void main(String[] args) {
		 Map<String, Integer> map = new HashMap<>();
	        map.put("Java", 90);
	        map.put("Python", 70);
	        map.put("C#", 10);
	        map.put("C++", 80);
	        
	        //convert map to list
	        
	        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
	        //sort by value
	        list.sort(Map.Entry.comparingByValue());
	        Map<String,Integer> sortedMap=new LinkedHashMap<>();
	        for(Map.Entry<String,Integer> ent:list) {
	        	sortedMap.put(ent.getKey(), ent.getValue());
	        }
	        System.out.println(sortedMap);
	}

}
