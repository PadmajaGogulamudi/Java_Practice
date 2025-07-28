package CaseStudy;

import java.util.Scanner;

public class FoodOrderSystem {
	static Scanner sc = new Scanner(System.in);
	static int quantity;
	static String item;
	static float total;

	public static void main(String[] args) {
		System.out.println("************Welcome to Vcube Restaurant************");
		System.out.println("Main Menu\n1.South Indian\n2.North Indian\n3.Chinese\nSelect any one type : ");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			SouthStyle();
			break;
		case 2:
			NorthStyle();
			break;
		case 3:
			ChineseStyle();
			break;
		default:
			System.out.println("Invalid selection");
		}
		printBill();

	}

	private static void printBill() {
		float discount=0;
		if(quantity>=3) {
			discount=20;
			
		}
		else if(quantity==2) {
			discount=(total*10)/100;
			
		}else {
			discount=0;
		}
		System.out.println("Selected item : "+item+"\nQuantity : "+quantity+"\nTotal Bill : "+(total-discount));
	}

	private static void ChineseStyle() {
		System.out.println(
				"Chinese Menu\nItem     Price\n1.Guotie--550\n2.Dumplings--50\n3.Mooncakes--230\nSelect any one type : ");
		int n = sc.nextInt();
		System.out.println("enter quantity : ");
		quantity = sc.nextInt();
		switch (n) {
		case 1:
			item = "Guotie";
			total = 550 * quantity;
			break;
		case 2:
			item = "Dumplings";

			total = 50 * quantity;
			break;
		case 3:
			item = "Mooncakes";
			total = 230 * quantity;

			break;
		default:
			System.out.println("Invalid selection");
		}

	}

	private static void NorthStyle() {
		System.out.println(
				"North Indian Menu\nItem     Price\n1.Butter Chicken--350\n2.Dal Makhani--250\n3.Aloo Paratha--250\nSelect any one type : ");
		int n = sc.nextInt();
		System.out.println("enter quantity : ");
		quantity = sc.nextInt();
		switch (n) {
		case 1:
			item = "Butter Chicken";
			total = 350 * quantity;
			break;
		case 2:
			item = "Dal Makhani";

			total = 250 * quantity;
			break;
		case 3:
			item = "Aloo Paratha";
			total = 250 * quantity;

			break;
		default:
			System.out.println("Invalid selection");
		}

	}

	private static void SouthStyle() {
		System.out.println(
				"South Indian Menu\nItem     Price\n1.Sambar rice--100\n2.Biryani--150\n3.Ragi matt--200\nSelect any one type : ");
		int n = sc.nextInt();
		System.out.println("enter quantity : ");
		quantity = sc.nextInt();
		switch (n) {
		case 1:
			item = "Sambar rice";
			total = 100 * quantity;
			break;
		case 2:
			item = "Biryani";

			total = 150 * quantity;
			break;
		case 3:
			item = "Ragi matt";
			total = 200 * quantity;

			break;
		default:
			System.out.println("Invalid selection");
		}

	}

}
