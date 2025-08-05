package LogicalStatements;

import java.util.Scanner;

public class FindFirstNonrepetingNumber {
	static boolean flag = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int r = 0;
		while (n != 0) {
			r = n % 10;
			if (findRepeat(n / 10, r)) {
				break;
			} else {

				n /= 10;

			}
		}
		if (flag)
			System.out.println("the first non-repeting number is : " + r);
		else
			System.out.println("no non-repeating number");

		sc.close();

	}

	private static boolean findRepeat(int n, int r) {
		int r1 = 0;
		int count = 0;
		while (n != 0) {
			r1 = n % 10;
			if (r1 == r) {
				count++;
			}
			n /= 10;

		}
		if (count == 0) {
			flag = true;
		}
		return flag;
	}

}
