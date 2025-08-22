package Inheritence2;

public class Dog extends Animal{
	void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	void sound() {
		System.out.println("boww boww");
		
	}

}
