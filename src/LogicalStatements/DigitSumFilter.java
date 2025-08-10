package LogicalStatements;

import java.util.Scanner;
//check it once
public class DigitSumFilter {

	public static void main(String[] args) {
		int agree=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter a number : ");
			int k=sc.nextInt();
			System.out.println("numbers are : ");
			for(int i=1;i<=200;i++) {
				if(isDivisible(i,k))
					System.out.print(i+" ");
				
			}
			
			System.out.println("\nwant to proceed for another number enter 1 : ");
			agree=sc.nextInt();
			
		}while(agree==0);
		sc.close();
	}

	private static boolean isDivisible(int n, int k) {
		
		int sum=0;
		while(n!=0 ) {
			sum+=n%10;
			n/=10;
			if(n<=0 && sum>9) {
				n=sum;
				sum=0;
			}
		}
		return sum==7;
	}

}
