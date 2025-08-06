package LogicalStatements;

import java.util.Scanner;
public class FindNeonNumber {
	static String agree;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do{System.out.println("Enter a number to check strong or not : ");
		int n = sc.nextInt();
		if (isNeonNum(n))
			System.out.println("the given number is Neon number");
		else
			System.out.println("the given number is not a Neon number");
		System.out.println("\nwant to check for another number enter Y ");
		agree=sc.next();

		
		}while(agree.equalsIgnoreCase("y"));
		sc.close();
	}

	private static boolean isNeonNum(int n) {
	 int squares =(int)Math.pow(n,2);
		if(n==sumOfDigits(squares))
			return true;
		return false;
	}

	private static int sumOfDigits(int squares) {
		int sum=0;
		while(squares!=0) {
			sum+=squares%10;
			squares/=10;
		}
		return sum;
	}

	

}
