package LogicalStatements;

import java.util.Scanner;

//145-> 1!+4!+5!=145
public class FindStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check strong or not : ");
		int n = sc.nextInt();
		if (isStrong(n))
			System.out.println("the given number is Strong");
		else
			System.out.println("the given number is not a Strong");
		sc.close();

	}

	private static boolean isStrong(int n) {
		int temp = n;
		int sum = 0;
		while (n != 0) {
			sum += findFactorial(n % 10);
			n /= 10;
		}

		return sum == temp;
	}

	private static int findFactorial(int i) {

		int factorial = 1;

		while (i > 0) {
			factorial = factorial * i;

			i--;
		}

		return factorial;
	}

}
