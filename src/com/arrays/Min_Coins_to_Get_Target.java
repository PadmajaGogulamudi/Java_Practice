package com.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Min_Coins_to_Get_Target {

	public static void main(String[] args) {
		int []coins= {2,4,5,1,3};
		Arrays.sort(coins);
		
//		System.out.println(Arrays.toString(coins));
//		for(int i:coins) {
//			System.out.println(i);
//		}
		
		System.out.println("Hello World");
		Map<Integer,List<Integer>> pairMap =new LinkedHashMap<>();
		boolean[] possible=new boolean[coins.length];
		
		int target=9;
		for(int i=0;i<coins.length;i++) {
			
			for(int j=i;j<coins.length;j++) {
			
				for(int k=i;k<j;k++) {
					
				}
				
			}
			
		}
		
		
	}

}
