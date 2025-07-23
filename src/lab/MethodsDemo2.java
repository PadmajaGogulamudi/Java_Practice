package lab;

import java.util.Scanner;

public class MethodsDemo2 {
	Scanner sc=new Scanner(System.in);
	static String  branchName="SBI";
	static String IFSC="003hgf";
	String Accname;
	long AccNum;
	double deposit;
	double savings;
	
	
	long setAccountNumber() {
		System.out.println("enter Account number: ");
		return sc.nextInt();
		
	}
	
	String setAccountHolderName() {
		System.out.println("enter AccountHolder Name: ");
		return sc.next();
	}
	
	double deposit() {
		System.out.println("enter Deposits: ");
		return sc.nextDouble();
	}
	double savings() {
		System.out.println("enter Savings: ");
		return sc.nextDouble();
	}
	

	public static void main(String[] args) {
		
		MethodsDemo2 m1=new MethodsDemo2();
		m1.AccNum=m1.setAccountNumber();
		m1.Accname=m1.setAccountHolderName();
		m1.deposit=m1.deposit();
		m1.savings=m1.savings();
		
		
		double total=m1.deposit+m1.savings;
		System.out.println("Account number: "+m1.AccNum+"\nAccount Holder Name : "+m1.Accname+"\ntotal Amount : "+total);

	}

}
