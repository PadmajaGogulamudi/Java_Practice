package com.collections.mapPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str="azxbcabx";
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character,Integer> itr:map.entrySet()) {
			if(itr.getValue()==1) {
				System.out.println(itr.getKey());
				break;
			}
		}
		
		
		
	}

}
