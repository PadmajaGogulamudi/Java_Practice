package Inheritence1;

public class Flower1 {
	String name = "Rose";
//	public void show() {
//		System.out.println();
//	}

}

class Flower2 extends Flower1 {
	void show() {
		System.out.println(name);
		System.out.println(super.name);
	}
	String name = "lilly";
}

class Flower3 extends Flower2 {
	String name = "marrygold";

	public static void main(String[] args) {
		Flower3 f3=new Flower3();
		f3.show();
		Flower2 f2=new Flower2();
		f2.show();
		
	
	}
	void show() {
		System.out.println(name);
		//System.out.println(super.name);
	}
}
//public class test1{
//	
//}
