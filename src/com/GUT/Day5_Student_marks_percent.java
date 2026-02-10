package com.GUT;

import java.util.Scanner;

public class Day5_Student_marks_percent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Student name : ");
		String name = sc.next();

		System.out.println("enter number of subjects : ");
		int n = sc.nextInt();
		int i = n;
		int[] marks = new int[n];
		double sum = 0;
		System.out.println("enter subject marks : ");
		while (--n >= 0) {
			sum += (marks[n] = sc.nextInt());
		}
		double percent = ((sum / (i * 100)) * 100);
		System.out.println("per : " + percent + "\ntotal : " + (sum));
		System.out.println("grade : " + ((percent >= 90 && percent <= 100) ? 'A'
				: (percent >= 75 && percent <= 89) ? 'B'
						: (percent >= 60 && percent <= 74) ? 'C' : (percent >= 50 && percent <= 59) ? 'D' : "fail"));
	}

}
