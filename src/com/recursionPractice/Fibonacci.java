package com.recursionPractice;

public class Fibonacci {
	static int count=0;

	public static void main(String[] args) {
		int[] arr=new int[5];
		findFibUpTO(5,arr,0,1,1);
		for(Integer i:arr) {
			System.out.println(i+" ");
		}
	}

	private static void findFibUpTO(int i,int[] arr,int a,int b,int sum) {
		
		if(i<=0) {
			
			return;
		}
		arr[i-1]=a;
		sum=a+b;
		a=b;
		b=sum;
		findFibUpTO(--i,arr,a,b,sum);
		
	}

}
