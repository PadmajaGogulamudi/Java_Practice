package com.arrays;

public class FindStringtarget {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 2, 2, 6, 5, 1 };
		int target = 12;
		findStrings(arr, target);

	}

	private static void findStrings(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			String s = "";
			for (int j = i; j < arr.length; j++) {

				if (count < target) {
					count += arr[j];
					s += "," + arr[j];

				}
				if (count == target) {
					System.out.println("[" + s.substring(1) + "]");
					break;

				} else if (count > target) {

					break;
				}

			}
		}

	}

}
