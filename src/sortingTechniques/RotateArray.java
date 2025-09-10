package sortingTechniques;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5 };
		int r = 0;
		while (true) {

			try {
				System.out.print("\nenter n value :");
				r = sc.nextInt();
			} catch (Exception e) {
				System.out.println("wrong input terminating!!");
				break;
			}

			rotateArr(arr, r);
			
		}
		sc.close();
	}

	private static void rotateArr(int[] arr, int r) {
		int s = 0;
		int e = arr.length - 1;
		int rem = r % arr.length;
		
		forright(arr,rem,s,e);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("--------------");
		
		
		forleft(arr,rem,s,e);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
		
		

	}

	private static void forleft(int[] arr, int rem, int s, int e) {
		if (rem != 0)
			reverseArr(arr, 0, arr.length - 1);
		else
			return;

		reverseArr(arr, s, rem - 1);
		reverseArr(arr, rem, arr.length - 1);
			
	}

	private static void forright(int[] arr, int rem, int s, int e) {
		if (rem != 0)
			reverseArr(arr, s,rem-1 );
		else
			return;

		reverseArr(arr,rem ,e);
		reverseArr(arr,s, e);		
	}

	private static void reverseArr(int[] arr, int s, int e) {
		int temp = 0;
		while (s < e) {
			temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}

}
