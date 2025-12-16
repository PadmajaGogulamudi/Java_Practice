package com.arrays;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the digit count you want : ");
		int n = sc.nextInt();
		int[] arr = { 122, 012222, 2506, 342 };
		System.out.println(countdigit(arr, n));

		sc.close();

	}

	private static int countdigit(int[] arr, int n) {
		int count = 0;

		for (int i : arr) {

			while (i != 0) {
				if (i % 10 == n) {
					count++;
				}
				i /= 10;

			}
		}
		return count;

	}

}
