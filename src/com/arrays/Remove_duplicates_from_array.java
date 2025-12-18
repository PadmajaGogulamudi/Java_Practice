package com.arrays;

public class Remove_duplicates_from_array {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 2, 3, 1, 3, 4 };
		boolean[] t = new boolean[arr.length];
		int c = 0;//to track result array size 
		for (int i = 0; i < arr.length; i++) {
			if (isDuplicate(arr[i], arr)) {
				t[i] = false;
			} else {
				c++;
				t[i] = true;
			}

		}
		int finalArr[]=new int[c];
		
		int index=0;
		//adding non duplicate ele from main array to resultant array
		for(int j=0;j<arr.length;j++) {
			if(t[j])
				finalArr[index++]=arr[j];
				
		}
		
		
		for(int k:finalArr) {
			System.out.print(k+" ");
		}
	}

	private static boolean isDuplicate(int ele, int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ele == arr[i]) {
				count++;
			}
		}
		return (count ==1) ? false : true;
	}

}
