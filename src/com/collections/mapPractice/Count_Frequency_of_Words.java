package com.collections.mapPractice;
import java.util.HashMap;
import java.util.Map;

public class Count_Frequency_of_Words {

	public static void main(String[] args) {
		String str="java is simple java is powerfull";
		String[] words=str.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(String word: words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println(map);
		
	}

}
