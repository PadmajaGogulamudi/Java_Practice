package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//find contigious sub arrays whose sum is equals to given targer-- my own try
//by yotube the problem name is FindSubArrays_whoes_sum_equ_target_HashMap_PrefixSum

//find contigious sub arrays whose sum is divisible by  given targer-- my own try
public class FindSubArrays_whoes_sum_equ_target {

	public static void main(String[] args) {
		int [] arr= {4,5,0,-2,-3,1};
		int count=0;
		List<List<Integer>> sub_Arrays=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=i;j<arr.length;j++) {
				List<Integer> arr1=new ArrayList<>();
				for(int k=i;k<=j;k++) {
					arr1.add(arr[k]);	
				}
				if(sum(arr1)%5==0) {
					count++;
					sub_Arrays.add(arr1);
				}
				
				
			}
			
		}
		int[][] sub=new int[sub_Arrays.size()][];
		for (int i = 0; i < sub_Arrays.size(); i++) {
			sub[i] = sub_Arrays.get(i).stream().mapToInt(Integer::intValue).toArray();
		}
		
		System.out.println(Arrays.deepToString(sub));
		System.out.println("no of sub arrays whoes sum equals to given target 5 are : "+count);

	}

	private static int sum(List<Integer> arr1) {
		int sum=0;
		for(int n:arr1) {
			sum+=n;
		}
		return sum;
	}

}
