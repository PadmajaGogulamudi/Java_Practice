package lab;

import java.util.Scanner;

public class DatatypeDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		System.out.println("enter pencil price:");
		int n=c.nextInt();
		System.out.println("enter money:");
		int m=c.nextInt();
		int k=m/n;
		int s=m-k*n;
		
		System.out.println("number of pens can buy:"+k+"\n"+"change remain:"+s);
		
		

	}

}
