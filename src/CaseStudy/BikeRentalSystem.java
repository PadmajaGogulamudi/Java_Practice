package CaseStudy;

import java.util.Scanner;

public class BikeRentalSystem {

	static int numOfCustomers;
	static int bonus;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.of customers : ");
		numOfCustomers = sc.nextInt();
		float costperBike = 0;
		float billOfCustomer = 0;
		float customersBill = 0;

		for (int i = 0; i < numOfCustomers; i++) {
			System.out.println("enter no.of bikes rented by " + (i + 1) + "'s customer : ");
			int rentedbikes = sc.nextInt();
			int j = 1;
			billOfCustomer = 0;
			while (rentedbikes != 0) {
				System.out.println("enter no.of hours " + j++ + "\'s bike rented : ");

				int rentedhour = sc.nextInt();
				costperBike = calBill(rentedhour);
				billOfCustomer += costperBike;

				rentedbikes--;

			}
			System.out.println("------------------***------------------");
			System.out.println("total bill of " + (i + 1) + "\'s customer : " + billOfCustomer);
			System.out.println("------------------***------------------");
			customersBill += billOfCustomer;

		}

		System.out.println("***************************************");
		System.out.println("total income for the day : " + customersBill);
		sc.close();
	}

	private static float calbonus(int rentedhour, int calcost) {

		if (rentedhour > 5) {
			bonus = (calcost * 10) / 100;

		} else {
			bonus = 0;
		}
		return bonus;

	}

	private static float calBill(int rentedhour) {

		int calcost;

		calcost = rentedhour * 50;
		return calcost - calbonus(rentedhour, calcost);

	}

}
