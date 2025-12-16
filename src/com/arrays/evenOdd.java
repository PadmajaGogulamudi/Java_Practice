package com.arrays;

public class evenOdd {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				arr[i]*=2;
			else
				arr[i]*=3;
			
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}
	}

}
