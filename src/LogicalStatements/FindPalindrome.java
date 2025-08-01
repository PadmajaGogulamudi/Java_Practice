package LogicalStatements;

import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number where to start : ");
		int n = sc.nextInt();

		int count = 0;
		while (count < 5 && n <= 200) {

			if (isPalindrome(n)) {
				System.out.print(n + " ");
				count++;
			}
			n++;
		}
	}

	private static boolean isPalindrome(int i) {
		String s = Integer.toString(i);
		int temp = i;
		String s1 = "";
		int r = 0;

		while (i != 0) {
			r = i % 10;
			s1 = s1 + Integer.toString(r);
			i /= 10;

		}
		if (Integer.parseInt(s1) == temp) {
			return true;
		}
		

		return false;

	}

}
