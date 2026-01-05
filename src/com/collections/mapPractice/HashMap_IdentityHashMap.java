package com.collections.mapPractice;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMap_IdentityHashMap {

	public static void main(String[] args) {
		Map<String,String> hashmap=new HashMap<>();//equals --> checks content
		Map<String,String> identity=new IdentityHashMap<>();//== --> checks references
		String s1=new String("java");
		String s2=new String("java");
		hashmap.put(s1, "paddu");
		hashmap.put(s2, "paddu");
		identity.put(s1, "paddu");
		identity.put(s2, "paddu");
		System.out.println("hashmap : "+hashmap);
		System.out.println("identity : "+identity);
	}

}
