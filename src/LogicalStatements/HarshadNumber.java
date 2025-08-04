package LogicalStatements;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		if (isharshad(n))
			System.out.println("given number is harshad ");
		else
			System.out.println("given number is not harshad ");

	}

	private static boolean isharshad(int n) {
		int temp = n;
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}

		return temp % sum == 0;
	}

}
