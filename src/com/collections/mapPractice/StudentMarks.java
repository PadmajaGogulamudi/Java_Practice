package com.collections.mapPractice;

import java.util.HashMap;
import java.util.Map;

public class StudentMarks {

	public static void main(String[] args) {
		Map<String,Integer> data=new HashMap<>();
		data.put("paddu", 100);
		data.put("subbu", 100);
		data.put("reddy", 50);
		for(String name: data.keySet()) {
			System.out.println("name : "+name+ "|| marks : "+data.get(name));
		}
	}

}
