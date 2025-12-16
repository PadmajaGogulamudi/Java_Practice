package com.arrays;

//1 2 3
//4 5 6
//7 8 9
//before=8
//after=12
//total=20
public class ExamQuestion {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b = 0;
		int a = 0;
		int total = 0;


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i != j) {
					if (i < j && (j == i + 1)) {
						b += arr[i][j];
					}

					if (j < i && (i == j + 1)) {
						a += arr[i][j];
					}

				}

			}
		}


		total = b + a;
		System.out.println("b=" + b + "\na=" + a + "\ntotal=" + total);

	}

}
