package com.objectClass;

public class Demo1 {
	
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		System.out.println(d1);
		Demo1 d2=new Demo1();
		System.out.println(d2);
		System.out.println("****************");
		System.out.println("d1.equals(d2)"+d1.equals(d2));
		
		System.out.println("****************");
		Demo1 d3=new Demo1();
		d3=d2;
		System.out.println("d3.equals(d2)"+d3.equals(d2));
		

		

		
	}

}
