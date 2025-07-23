package lab;

import java.util.Scanner;

//17-7-2025
public class FuelPurchase {
	static Scanner sc = new Scanner(System.in);
	String vehNum;
	float p;
	float d;
	static double petrolPrice = 108.97;
	
	static double dieselPrice = 96.15;

	public FuelPurchase(String vehNum) {
		
		this.vehNum = vehNum;
	}

	private double Petrolpurchase() {
		System.out.println("enter petrol no.of liters purchased : ");
		p = sc.nextFloat();
		
		return p * petrolPrice  ;

	}
	private double diselepurchase() {
		System.out.println("enter diesel no.of liters purchased : ");
		d = sc.nextFloat();
		return d * dieselPrice;
	}

	private void totalBill() {
		double pp=Petrolpurchase();
		double dd=diselepurchase();
		double total=pp+dd;
		System.out.println("vehicle number : " + vehNum + "\npetrol purchased in liters : " + p
				+ "\ndisele purchased in liters : " + d + "\ntotal bill : " + total + "\n**********************");

	}

	

	public static void main(String[] args) {
		System.out.println("enter vehicle number : ");
		String s = sc.next();
		FuelPurchase f1 = new FuelPurchase(s);
		f1.totalBill();

		System.out.println("enter vehicle number : ");
		String s1 = sc.next();
		FuelPurchase f2 = new FuelPurchase(s1);
		f2.totalBill();

		System.out.println("enter vehicle number : ");
		String s2 = sc.next();
		FuelPurchase f3 = new FuelPurchase(s2);
		f3.totalBill();
		

	}

}
