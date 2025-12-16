package com.arrays;
//input:

//00 01 02
//10 11 12
//20 21 22
//
//-------------
//output:
//20 10 00
//21 11 01
//22 12 02

public class RotateArray90Degree {

	public static void main(String[] args) {
		int a1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int a3[][] = new int[a1.length][a1.length];

		for (int i = 0; i < a1.length; i++) {
			int k=a1.length-1;
			for(int j=0;j<a1.length;j++) {
				a3[i][j]=a1[k--][i];
			}

		}
		for(int[] s:a3) {
			for(int l:s) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}

}
