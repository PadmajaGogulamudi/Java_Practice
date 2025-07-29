package LogicalStatements;

import java.util.Scanner;

public class SecondPerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr starting value : ");
		int n = sc.nextInt();
		System.out.println("enetr ending value : ");
		int m = sc.nextInt();
		System.out.println("enetr which position  value you want in given range of perfect numbers : ");
		int k = sc.nextInt();
		int count=0;
		int req=0;
		
		for(int i=n;i<=m;i++) {
			
			if(isperfect(i)) {
				System.out.print(i +" ");
				count++;
				if(count==(k-1)) {
					req=i;
					
					
			}
			
		}
	}
		System.out.println();
		System.out.println("required value is "+ req);
	}

	private static boolean isperfect(int n) {
		
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
			
			}
		return sum==n;
			}
			
	}


