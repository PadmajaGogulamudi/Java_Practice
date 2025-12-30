package com.arrays;
//input :

//0,1,1
//1,1,1
//1,1,0
//output:
//0,0,0
//0,1,0
//0,0,0

public class matrixManupulation {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 1 }, { 1, 1, 1 }, { 1, 1, 0 } };
		int[][] arr1 = { { 0, 1, 1 }, { 1, 1, 1 }, { 1, 1, 0 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr[i][j] == 0) {
					makeRowsZero(i,j, arr1);
					
				}
			}
		}

		for (int[] i : arr1) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	static void makeRowsZero(int row,int col, int[][] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[row][i] = 0;

		}
		for (int i = 0; i < arr1.length; i++) {
			arr1[i][col] = 0;

		}
	}

	
}
