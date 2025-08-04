package LogicalStatements;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		String s="";
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("enter a number  : ");
		int n = sc.nextInt();
		printBinary(n);
		System.out.println("\nwant to proceed for another number :");
		s=sc.next();
		}while(s.equalsIgnoreCase("y"));	

	}

	private static void printBinary(int n) {
		int[] arr=new int[10];
		int i=0;
		while(n!=0) {
			
			arr[i]=n%2;
			i++;
			n/=2;
			
			
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
		
		
	}

}
