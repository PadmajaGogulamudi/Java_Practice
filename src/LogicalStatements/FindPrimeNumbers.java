package LogicalStatements;

import java.util.Scanner;

public class FindPrimeNumbers {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Finding prime numbers in given range\nenter where to start :");
		int n=sc.nextInt();
		System.out.println("enter where to proceed : ");
		int m=sc.nextInt();
		findPrime(n,m);
	

	}

	private static void findPrime(int n, int m) {
		int count;
		
	for(int i=n;i<=m;i++) {
		count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(i+" ");
		}
	}
		
	}

}
