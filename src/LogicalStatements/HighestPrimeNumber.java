package LogicalStatements;

import java.util.Scanner;

public class HighestPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number where to proceed : ");
		int n = sc.nextInt();
		for (int i = n-1; i >= 2; i--) {
			if (isPrime(i)) {
				System.out.println(i);
				break;
			}
		}

	}

	private static boolean isPrime(int i) {
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0)
				return false;
		}

		return true;
	}

}
