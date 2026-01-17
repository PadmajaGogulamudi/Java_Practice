package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray2times {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter size : ");
			int n=sc.nextInt();
			System.out.println("enter nums : ");
			int []arr= new int[n]; 
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			int arr1[]=new int[2*n];
			for(int j=0;j<2*n;j++) {
				arr1[j]=arr[j%n];
			}
			System.out.println(Arrays.toString(arr1));
		}
	}

}
