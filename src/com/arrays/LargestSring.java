package com.arrays;

public class LargestSring {

	public static void main(String[] args) {
		String[] arr = { "absd", "fbch", "jrhfbch", "fn" };
		int maxlength=0;
		int maxEleindexs=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>maxlength) {
				maxlength=arr[i].length();
				maxEleindexs=i;
			}
		}
		System.out.println(arr[maxEleindexs]);

	}

}
