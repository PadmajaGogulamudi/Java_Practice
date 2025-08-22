package oops.interfaces;

import java.util.Scanner;

public class MakePayment {
	static Scanner sc = new Scanner(System.in);

	static void paymentType(Payment p) {
		System.out.println("enter payment amount : ");
		double n=sc.nextDouble();
		p.payBill(n);
	}

	public static void main(String[] args) {
		
		
		System.out.println("1.creditCard\n2.PayPal\n3.UPI\nselect type of payment : ");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			MakePayment.paymentType(new CreditCard());
			break;
		case 2:
			MakePayment.paymentType(new PayPal());
			break;
		case 3:
			MakePayment.paymentType(new UPI());
			break;
		default:
			System.out.println("invalid selection!!!");
		}
		sc.close();

	}

}
