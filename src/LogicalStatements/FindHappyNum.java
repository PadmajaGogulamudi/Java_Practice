package LogicalStatements;

import java.util.Scanner;
public class FindHappyNum {
	static int temp;
	static boolean flag=false;

	public static void main(String[] args) {
		int yes=0;
		Scanner sc = new Scanner(System.in);
		do{System.out.println("enter a number : ");
		int n = sc.nextInt();
		temp = n;
		if (isHappy(n))
			System.out.println("given number is happy number");
		else
			System.out.println("given number is not a happy number");
		System.out.println("if you want to proceed for another number enter 1:");
		yes=sc.nextInt();
		}while(yes==1);
	}

	public static boolean isHappy(int n) {
	
		if(n==1) {
			return true;
		}
		
		
		int r = 0;
		int sum = 0;
		while (n != 0) {
			r = n % 10;
			sum += r * r;
			n /= 10;

		}
		 if (sum == 1) {
			return true;
		} else if(sum>9) {
			if(isHappy(sum)) {
				flag=true;
				}
		}
		return flag;

	}
}
