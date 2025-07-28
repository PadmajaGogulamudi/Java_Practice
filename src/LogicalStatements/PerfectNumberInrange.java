package LogicalStatements;

import java.util.Scanner;

public class PerfectNumberInrange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr starting value : ");
		int n = sc.nextInt();
		System.out.println("enetr ending value : ");
		int m = sc.nextInt();
		for(int i=n;i<=m;i++) {
			if(findPerfect(i)) {
				System.out.println(i);
			}
		}
		
		}

	private static boolean findPerfect(int n) {
		int sum=0;
for(int i=1;i<=n/2;i++) {
	if(n%i==0) {
		sum+=i;
	}
	
	}
return sum==n;
	}
	
	

}
