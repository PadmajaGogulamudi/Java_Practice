package patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int n=sc.nextInt();
		
		int num = 1;
		int num1 = n*n+n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < n; k++) {
				System.out.print(num++ + " ");
			}
			int count = 0;
			for (int m = num1 - n + 1; m <= num1 - i; m++) {
				System.out.print(" " + m);
				count++;

			}
			num1 = num1-count+1;

			System.out.println();
		}

	}

}
