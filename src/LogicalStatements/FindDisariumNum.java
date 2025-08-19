package LogicalStatements;

import java.util.Scanner;

public class FindDisariumNum {

	public static void main(String[] args) {
		String yes = "no";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter a number : ");
			int n = sc.nextInt();

			if (isDisarinumNum(n))
				System.out.println("given number is Disarium number");
			else
				System.out.println("given number is not a Disarium number");
			System.out.println("If you want to proceed for another number enter [yes/no]:");
			yes = sc.next();
		} while (yes.equalsIgnoreCase("yes"));
		sc.close();
	}
//135--> 1^1+3^2+5^3=135
	//"135".length()==3
	private static boolean isDisarinumNum(int n) {
		int temp = n;
		int sum = 0;
		int position = Integer.toString(n).length();
		while (n != 0) {
			sum += Math.pow(n % 10, position--);
			
			n /= 10;
		}

		return sum == temp;
	}

}
