package com.collections.mapPractice;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap_practice {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3=new String("java");
		String s4=new String("java");
		Map<String, String> map1 = new HashMap<>();
		map1.put(s1, "paddu");
		map1.put(s2, "reddy");
		System.out.println(map1);
		Map<String, String> map2=new IdentityHashMap<>();
		map2.put(s3, "abcd");
		map2.put(s4, "kkk");
		System.out.println(map2);

		
		
		
	}

}
