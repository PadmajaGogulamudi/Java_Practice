package com.interfacesPractice;

@FunctionalInterface
interface Calculator{
	void add(int a,int b);
	
	
	default void show() {
		
	}
}



abstract class AbsClass implements Calculator{
//	public void add(int a,int b) {
//		
//	}
//	
//	
	
	
	 abstract void xyz();
}

public class FuncInterDemo1 extends AbsClass{

	public static void main(String[] args) {
//		Calculator f1=(a,b)->{
//			System.out.println(a+b);
//			
//		};
//		f1.add(2, 6);

	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void xyz() {
		// TODO Auto-generated method stub
		
	}

}
