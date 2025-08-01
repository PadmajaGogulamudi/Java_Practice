package LogicalStatements;

import java.util.Scanner;

public class MagicalNumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  : ");
		int n = sc.nextInt();
		if (ismagicalNumber(n)) {
			System.out.println("The given number is a magic");

		} else
			System.out.println("The given number is not a magic");
	}

	private static boolean ismagicalNumber(int n) {
		int temp=n;
		int sum=0;
		int r=0;
		while(n!=0 ) {
		sum=getFinalSum(n);
		n=sum;
		if(sum<10) {
			break;
		}
		}
		
		return sum==1;

}

	private static int getFinalSum(int n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
			
		}
	
		return sum;
	}
}
	
