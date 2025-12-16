package com.arrays;
//1,2
//3,4
//5,6


//1,3,5
//2,4,6


public class NormaltoTransposeMatrix {

	public static void main(String[] args) {
		//int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr1= {{1,2},{3,4}};
		int[][] arr2=new int[arr1[0].length][arr1.length];
		for(int i=0;i<arr1.length;i++) {
		
			for(int j=0;j<arr1[i].length;j++) {
				arr2[j][i]=arr1[i][j];
				
			}
		}
		
		for(int[] i:arr1) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********************");
		for(int[] i:arr2) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
