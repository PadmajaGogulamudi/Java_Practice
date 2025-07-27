package LogicalStatements;

import java.util.Scanner;

public class FindPrimeDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ispPrime=ispPrime(n);
		System.out.println(ispPrime);

	}

	private static boolean ispPrime(int n) {
		boolean status=false;
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				
			}
			
		}
		if(count<=2) {
			status=true;
		}
		return status;
	}

}
