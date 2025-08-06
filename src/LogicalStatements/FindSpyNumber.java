package LogicalStatements;

import java.util.Scanner;
//112->1+1+2=4 and 1*1*2=2 not spy
//123->1+2+3=6 and 1*2*3=6 spy
public class FindSpyNumber {
static String  agree;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do{System.out.println("Enter a number to check Spy or not : ");
		int n = sc.nextInt();
		if (isSpyNum(n))
			System.out.println("the given number is Spy number");
		else
			System.out.println("the given number is not a Spy number");
		System.out.println("\nwant to check for another number enter Y ");
		agree=sc.next();

		
		}while(agree.equalsIgnoreCase("y"));
		sc.close();
	}

	private static boolean isSpyNum(int n) {
		int r=0;
		int sum = 0;
		int product = 1;
		while (n != 0) {
			r=n % 10;
			sum +=r ;
			product *= r;
			n /= 10;
		}
		
		
		if (sum == product)
			return true;
		return false;
	}

}
