package Inheritence2;

import Inheritence1.GrandParent;

public class Child extends Parent{
	@Override
	 public void display() {
		super.display();
		System.out.println("hello Child");
		GrandParent p=new GrandParent();
		p.display();
	}


	
		
		
		
	

}
