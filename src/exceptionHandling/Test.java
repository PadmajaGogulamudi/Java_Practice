package exceptionHandling;

class A {
	void show() {
		System.out.println("A");
	}
}

class B extends A {
	void show() {
		System.out.println("B");
	}
}

class Test {
	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new B();
		obj1.show();
		obj2.show();
	}
}