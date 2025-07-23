package lab;

import java.util.Scanner;

//CaseStudy1

public class Billing {
	static Scanner sc = new Scanner(System.in);
	static float costOfRice ;//cost of rice per KG 
	static float costOfSugar ;//cost of Sugar per KG
	static float costOfOil;// cost of oil per liter
	float RiceQuantity;
	float SugarQuantity;
	float OilQuantity;
	float amount;
	
	 {
		
		System.out.println("cost of rice per KG");
		Billing.costOfRice=sc.nextFloat();
		System.out.println("cost of Sugar per KG");
		Billing.costOfSugar=sc.nextFloat();
		System.out.println("cost of oil per liter");
		Billing.costOfOil=sc.nextFloat();
	
	
		
	}

	float totalCostOfRice(float a) {
		float re = a * costOfRice;
		return re;
	}

	float totalCostOfSugar(float a) {
		float re = a * costOfSugar;
		return re;
	}

	float totalCostOfOil(float a) {
		float re = a * costOfOil;
		return re;
	}

	float finalBill(float a, float b, float c) {
		float re = a + b + c;
		return re;
	}

	float change(float a, float b) {
		float re = a-b;
		return re;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Billing b1 = new Billing();
		System.out.println("enter  quantities you want:\nRice Quantity :  ");
		b1.RiceQuantity = sc.nextFloat();

		System.out.println("Sugar Quantity : ");
		b1.SugarQuantity = sc.nextFloat();

		System.out.println("Oil Quantity : ");
		b1.OilQuantity = sc.nextFloat();
		System.out.println("-------------****------------");

		System.out.println("total cost for each item :");

		float Rice = b1.totalCostOfRice(b1.RiceQuantity);
		System.out.println("Rice : " + Rice);
		float Sugar = b1.totalCostOfSugar(b1.SugarQuantity);
		System.out.println("Sugar : " + Sugar);
		float Oil = b1.totalCostOfOil(b1.OilQuantity);
		System.out.println("Oil : " + Oil);
		System.out.println("-------------****------------");

		float Fb = b1.finalBill(Rice, Sugar, Oil);
		System.out.println("Final Bill : " + Fb);
		System.out.println("Money given : " );
		
		b1.amount=sc.nextFloat();
		
		float c = b1.change(b1.amount, Fb);
		System.out.println("change to customer : " + c);
		sc.close();

	}

}
