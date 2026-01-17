package com.collections.mapPractice;

import java.util.Scanner;

public class MonthsToSeason {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter num : ");
			int n = sc.nextInt();

			String season = (n <= 5 && n >= 3) ? "Spring"
					: (n >= 6 && n <= 8) ? "Summer"
							: (n >= 9 && n <= 11) ? "Autumn" : (n == 12 || (n >= 1 && n <= 2)) ? "Winter" : "invalid";
			System.out.println(season);
		}

	}

}
