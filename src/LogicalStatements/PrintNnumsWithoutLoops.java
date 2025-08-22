package LogicalStatements;

import java.util.Scanner;
//Printing 1 to n with out using loops
public class PrintNnumsWithoutLoops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stating value : ");
		int n=sc.nextInt();
		System.out.println("enter ending value : ");
		int m=sc.nextInt();
		printvalues(n,m);
		sc.close();

	}

	private static void printvalues(int n, int m) {
		System.out.println(n++);
		
		if(n<=m+1 && n!=m+1) {
			printvalues(n,m);
		}
		
	}

}
