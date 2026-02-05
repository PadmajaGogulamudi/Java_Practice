package com.GUT;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		int x;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number: ");
			int n = sc.nextInt();

			System.out.println("enter b number: ");
			int m = sc.nextInt();
			System.out.println("select the operation:\n1.add\n2.sub\n3.mul\n4.Div");
			int c = sc.nextInt();

			switch (c) {
			case 1 -> {
				add(n, m);
			}
			case 2 -> {
				sub(n, m);
			}

			case 3 -> {
				mul(n, m);
			}
			case 4 -> {
				Div(n, m);
			}
			default -> {
				System.out.println("invalid !!");
			}

			}
			System.out.println("want to continue enter 1");
			x = sc.nextInt();

		} while (x == 1);
	}

	private static void Div(int n, int m) {
		try {
			float c = n / m;
			System.out.println(c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

	private static void mul(int n, int m) {
		System.out.println(n * m);

	}

	private static void sub(int n, int m) {
		System.out.println(n - m);

	}

	private static void add(int n, int m) {
		System.out.println(n + m);

	}

}
