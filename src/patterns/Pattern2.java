package patterns;

import java.util.Scanner;

//*
//**
//***
//****
//*****
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("enter n value  : ");
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <=i; j++) {
					System.out.print(j);
				}

				System.out.println();
			}
			System.out.println("--------------------");
//			1
//			21
//			321
			for (int i = 1; i <= n; i++) {
				for (int j = i; j>=1; j--) {
					System.out.print(j);
				}

				System.out.println();
			}
			System.out.print("want to proceed for another number ?[y/n]:");
		} while (sc.next().equalsIgnoreCase("y"));
		sc.close();
	}
}
