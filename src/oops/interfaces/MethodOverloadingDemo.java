package oops.interfaces;

public class MethodOverloadingDemo {

	void method1(int a, int b) {
		System.out.println(a * b);
	}

	void method1(float a, float b) {
		System.out.println(a * b);
	}

	void method1(String a, String b) {
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		MethodOverloadingDemo m1=new MethodOverloadingDemo();
		m1.method1(1.1f, 2.1f);
		m1.method1(null, null);
		
	}

}
