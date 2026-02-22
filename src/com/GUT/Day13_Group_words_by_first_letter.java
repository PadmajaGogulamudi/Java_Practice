package com.GUT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Group words by first letter (lowercase), keep values sorted
//Input
//["Apple","apricot","banana","Blueberry","cherry","Avocado"]
//Output
//{a=[Apple, apricot, Avocado], b=[banana, Blueberry], c=[cherry]}
//(If sorting case-insensitive)

public class Day13_Group_words_by_first_letter {

	public static void main(String[] args) {
		String[] arr = { "Apple", "apricot", "banana", "Blueberry", "cherry", "Avocado" };

		for (Map.Entry<String, List<String>> res : getAnswer(arr).entrySet()) {
			System.out.println(res.getKey()+" : "+res.getValue());
		}
		

	}

	private static Map<String, List<String>> getAnswer(String[] arr) {
		String s="";
		Map<String,List<String>> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			String c=(arr[i].charAt(0)+"").toLowerCase();
			if(s.indexOf(c)==-1) {
				
				s+=c;
				for(int j=i;j<arr.length;j++) {
					String str=arr[j];
					if(c.equalsIgnoreCase((arr[j].charAt(0)+"").toLowerCase())) {
						List<String> val=map.getOrDefault(c, new ArrayList<>());
						val.add(str);
						map.put(c,val );
					}
					
				}
				List<String> list=new ArrayList<>(map.get(c));
				Collections.sort(list);
				map.put(c,list);
				
			}
			
		}

		return map;
	}

}
