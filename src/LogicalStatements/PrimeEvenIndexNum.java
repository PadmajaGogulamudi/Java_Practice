package LogicalStatements;

import java.util.Scanner;

public class PrimeEvenIndexNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int agree = 0;
		int k = 0;
		do {

			System.out.println("enter where to start : ");
			int n = sc.nextInt();
			System.out.println("enter upto where to proceed : ");
			int m = sc.nextInt();
			System.out.println("which index you want even or odd : ");
			String s = sc.next();
			if (s.equalsIgnoreCase("even"))
				k = 1;
			else
				k = 0;

			printPrime(n, m, k);
			System.out.println("\nif you want to proceed further enter 1 :");
			agree = sc.nextInt();
		} while (agree == 1);

		sc.close();

	}
// 2 3 5 7 11 13 17 
// 0 1 2 3 4  5  6 
	private static void printPrime(int n, int m, int k) {
		int count = 1;
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				count++;
				// System.out.print(i+" ");
				if (count % 2 == k) {
					System.out.print(i + " ");

				}
			}

		}

	}

	private static boolean isPrime(int n) {

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
