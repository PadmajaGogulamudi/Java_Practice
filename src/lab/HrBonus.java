package lab;

import java.util.Scanner;

public class HrBonus {
	static Scanner sc = new Scanner(System.in);
	String name;
	int experience;
	float bonus;

	public HrBonus(String string, int i) {
		name = string;
		experience = i;
		calBonus();

	}

	private void calBonus() {
		if (experience < 0)
			System.err.println("Invalid experience entered ");
		else {
			
			if(experience >= 0 & experience <= 1)
				bonus=0;
			else if(experience >= 2 & experience <= 4)
				bonus=5000;
			else if(experience >= 5 & experience <= 9)
				bonus=10000;
			else
				bonus=20000;
				
			

		}
		show();
	}

	private void show() {
		System.out.println("emp name : " + name + "\nExperience : " + experience + "\nBonus :" + bonus);
	}

	public static void main(String[] args) {
		// System.out.println("enter name : ");

		HrBonus h1 = new HrBonus("ABCD", -10);

	}

}
