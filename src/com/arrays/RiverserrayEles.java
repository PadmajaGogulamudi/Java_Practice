package com.arrays;

public class RiverserrayEles {

	public static void main(String[] args) {
		int[] arr = { 13, 32, 56, 150, 34 };
		// String[] arr1 = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(reverseNum(arr[i]) + " ");
		}
//		for (String i : arr1) {
//			System.out.print(i + " ");
//		}
	}

	private static String reverseNum(int i) {
		String rev = "";

		while (i != 0) {
			rev += Integer.toString(i % 10);
			i /= 10;

		}
		return rev;
	}

}
