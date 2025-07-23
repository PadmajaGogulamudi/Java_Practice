package lab;
//
//public class AsciiCheck {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		char a='A'+1;
//		char b='B';
//		//int c='A'+1;
//		System.out.println("Ascii value of "+ a         +" is: "+a);
//		//System.out.println("Ascii value of "+ b        +" is: "+b);
//	}
//
//}
//package com.lab;
import java.util.Scanner;

public class market6 {
	 static int ricePrice=45;
	 static int sugarPrice=40;
	 static int oilPrice=130;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rice quantity= ");
		double riceQuty=sc.nextDouble();
		System.out.println("Enter sugar quantity= ");
		double sugarQuty=sc.nextDouble();
		System.out.println("Enter oil quantity= ");
		double oilQuty=sc.nextDouble();
		double riceTotal=riceQuty * ricePrice;
		double sugarTotal=sugarQuty * sugarPrice;
		double oilTotal=oilQuty * oilPrice;
		double finalAmount=riceTotal +sugarTotal +oilTotal;
		System.out.println("Enter given amount = Rs.");
		double amount = sc.nextDouble();
		if(amount >= finalAmount) {
			double change=amount-finalAmount;
			System.out.println("Change =Rs."+change);
		}else {
			double needed=finalAmount-amount;
			System.out.println("inscifishient amount Rs."+ needed + " is needed");
		}
		sc.close();
		
	}

}
