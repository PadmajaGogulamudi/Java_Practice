package com.collections.mapPractice;

import java.util.HashMap;
import java.util.Map;

public class CheckKey {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "paddu");
		map.put(2, "paddu");

		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("paddu"));
		
	}

}
