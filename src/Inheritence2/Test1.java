package Inheritence2;

public class Test1 extends Animal{

	public static void main(String[] args) {
		Animal d= new Dog();
		d.eat();
		d.sound();
		Cat c=new Cat();
		c.eat();
		c.sound();
		Test1 t=new Test1();

	}

	@Override
	void sound() {
System.out.println("test sound!!");		
	}

}
