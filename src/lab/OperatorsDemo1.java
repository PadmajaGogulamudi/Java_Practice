package lab;

import java.util.Scanner;

public class OperatorsDemo1 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value : ");
		int a=sc.nextInt();
		System.out.println("enter b value : ");
		int b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a value : "+a);

		System.out.println("b value : "+b);
		

	}

}
