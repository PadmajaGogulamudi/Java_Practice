package com.GUT;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num: ");
		int n=sc.nextInt();
		System.out.println((isEvenOrOdd(n)?"even":"odd"));
		System.out.println((isPrime(n)?"prime":"not prime"));

		System.out.println((isPalindrome(n)?"palin":"not palin"));

		sc.close();
	}
	static boolean isEvenOrOdd(int n){
		return (n%2==0)?true:false;
	}
	static boolean isPrime(int n){
		if(n==1)
			return false;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
			
		}
		return true;
		
	}
	static boolean isPalindrome(int n){
		String s=n+"";
		for(int i=0;i<s.length()/2;i++) {
			if(!((s.charAt(i)+"").equals(s.charAt(s.length()-1-i)+"")))
				return false;
		}
		return true;
		
	}
}
