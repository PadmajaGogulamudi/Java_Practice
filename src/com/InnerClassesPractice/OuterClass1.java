package com.InnerClassesPractice;

public class OuterClass1 {
	 private int i=101;

	public static void main(String[] args) {
		
		InnerClass1 obj1=new OuterClass1.InnerClass1() {

			@Override
			public  void show() {
				System.out.println("show from inner2 implemented   !!");
				
			}
			
		};
		obj1.show();
		//OuterClass1.InnerClass2 obj2=new OuterClass1().new  InnerClass2();
		InnerClass2.show();

	}
	public static abstract  class InnerClass1{
		   abstract void  show() ;
	}
	public   class InnerClass2{
		public static void show() {
			System.out.println("show from inner2 instance !!");
		}
	}

}
