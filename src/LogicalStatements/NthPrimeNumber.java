package LogicalStatements;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nth prime number you want : ");
		int m = sc.nextInt();
		int n=2;
		int count=0;
		int value=0;
		while(count<m) {
			if(isPrime(n)) {
				System.out.print(n+" ");
				
				count++;
				if(count==m)
					value=n;
			}
			
			
			n++;
			
		}
		System.out.println("\nthe required value is : "+value);

	}
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
