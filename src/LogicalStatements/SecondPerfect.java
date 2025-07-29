package LogicalStatements;

import java.util.Scanner;

public class SecondPerfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr Start value : ");
		int m = sc.nextInt();
		System.out.println("enetr end  value : ");
		int n = sc.nextInt();
		System.out.println("enetrwhich position  value you want : ");
		int k = sc.nextInt();
		
		int count=0;
		int value=0;
		for(int i=m;i<=n;i++) {
			if(isperfect(i)) {
				System.out.print(i+" ");
				count++;
				if(count==k) {
					value=i;
					
				}
			}
			
		}
		System.out.println();
		System.out.println("final value you needed is :"+value);
		

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
