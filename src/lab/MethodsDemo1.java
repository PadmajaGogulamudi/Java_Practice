package lab;

import java.util.Scanner;

public class MethodsDemo1 {

	int sub(int a, int b) {

		return a - b;
	}

	int mul(int a, int b) {

		return a * b;
	}

	int div(int a, int b) {

		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MethodsDemo1 d1 = new MethodsDemo1();

		System.out.println("enter a : ");
		int a = sc.nextInt();
		System.out.println("enter b : ");
		int b = sc.nextInt();

		int c1 = d1.add(a, b);
		System.out.println("a+b : " + c1 + "\nenter second arg : ");

		int b1 = sc.nextInt();
		int c2 = d1.sub(c1, b1);
		System.out.println("a-b : " + c2 + "\nenter second arg : ");

		int b2 = sc.nextInt();
		int c3 = d1.mul(c2, b2);
		System.out.println("a*b : " + c3 + "\nenter second arg : ");

		int b3 = sc.nextInt();
		int c4 = d1.div(c3, b3);
		System.out.println("a/b : " + c4);

		sc.close();
	}

	int add(int c, int d) {

		return c + d;
	}

}
