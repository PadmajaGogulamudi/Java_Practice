package oops.interfaces;

public class Elephant implements Animal {
	@Override
	public void sleep() {
		System.out.println("Elephant  sleep's all the day");

	}

	@Override
	public void eat() {
		System.out.println("Elephant can't eat meat");

	}
	@Override
	public void sound() {
		System.out.println("Elephant can make sound");

	}
	
	
}
