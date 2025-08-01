package LogicalStatements;

import java.util.Scanner;

public class AmstrongnumberDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  : ");
		int n = sc.nextInt();
		if(isAmstrong(n)) {
			System.out.println("The given number is an Amstrong");
			
		}else
			System.out.println("The given number is not an Amstrong");
		
			

	}

	private static boolean isAmstrong(int n) {
		int temp=n;
		int r=0;
		int sum=0;
		int p=getlength(n);
		while(n!=0) {
			r=n%10;
			sum+=getPower(r,p);
			n/=10;
			
			
		}
		return sum==temp;
	}

	private static int getPower(int r, int p) {
		int val=1;
		while(p>0) {
			val=val*r;
			p-=1;
		}
		
		return val ;
	}

	private static int getlength(int n) {
		int p=0;
		
		while(n!=0) {
			
			n/=10;
			p++;
			
		}
		return p;
	}

}
