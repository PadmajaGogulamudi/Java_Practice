package lab;

import java.util.Scanner;

public class DataTypeDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A value:");
		int a=sc.nextInt();
		System.out.println("enter B value:");
		int b=sc.nextInt();
		long m=a*b;
		double d=a/b;
		System.out.println("mul:"+m);
		System.out.println("div:"+d);
		
		sc.close();
	}

}
