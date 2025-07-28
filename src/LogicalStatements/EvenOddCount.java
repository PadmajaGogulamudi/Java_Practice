package LogicalStatements;

import java.util.Scanner;

public class EvenOddCount {
	static int evenCount;
	static int oddCount;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr starting value : ");
		int n = sc.nextInt();
		System.out.println("enetr ending value : ");
		int m = sc.nextInt();
findEvenCount(n,m);
findOddCount(n,m);
System.out.println("even numbers count in given range "+n+" to "+m+"is : "+evenCount);
System.out.println("odd numbers count in given range "+n+" to "+m+"is : "+oddCount);

	}

	private static void findOddCount(int n, int m) {
		for(int i=n;i<=m;i++) {
			if(i%2!=0)
				oddCount++;
		}
	}

	private static void findEvenCount(int n, int m) {
		for(int i=n;i<=m;i++) {
			if(i%2==0)
				evenCount++;
		}
	}

}
