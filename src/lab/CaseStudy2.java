package lab;

import java.util.Scanner;

public class CaseStudy2 {
//case study 2
	static Scanner sc = new Scanner(System.in);
	static float StartersPrice;
	static float MainCoursePrice;
	static float DessertPrice;

	static int tax = 5;
	static int serviceCharge = 10;
	{
		System.out.println("enter Starters Price : ");
		CaseStudy2.StartersPrice = sc.nextFloat();

		System.out.println("enter Main Course Price : ");
		CaseStudy2.MainCoursePrice = sc.nextFloat();

		System.out.println("enter Dessert Price : ");
		CaseStudy2.DessertPrice = sc.nextFloat();

	}

	public static void main(String[] args) {
		CaseStudy2 c1 = new CaseStudy2();

		double subtotal = c1.subtotal(CaseStudy2.StartersPrice, CaseStudy2.MainCoursePrice, CaseStudy2.DessertPrice);

		double taxAmount = c1.taxAmount(subtotal);

		double serviceChargeAmount = c1.serviceChargeAmount(subtotal);

		double finalBill = c1.finalBill(subtotal, taxAmount, serviceChargeAmount);
		System.out.println("------------------****---------------------");
		System.out.println("Subtotal : " + subtotal + "\nTax Amount : " + taxAmount + "\nService Charge Amount : "
				+ serviceChargeAmount + "\nFinal Bill : " + finalBill);

	}

	private double finalBill(double subtotal, double taxAmount, double serviceChargeAmount) {
		return subtotal + taxAmount + serviceChargeAmount;
	}

	private double serviceChargeAmount(double subtotal) {
		return (subtotal * serviceCharge) / 100;
	}

	private double taxAmount(double subtotal) {
		return (subtotal * tax) / 100;
	}

	private double subtotal(float startersPrice2, float mainCoursePrice2, float dessertPrice2) {

		return startersPrice2 + mainCoursePrice2 + dessertPrice2;
	}

}
