package LogicalStatements;

import java.util.Scanner;

public class FindEvenWithoutifelse {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n=60;
		printEven(n);

	}

	private static void printEven(int n) {
		for (int i = 0; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}

	}

}

