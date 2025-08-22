package oops.interfaces;

public class Rat implements Animal{
	@Override
	public void sleep() {
System.out.println("rat can sleep at morning times");
	}

	@Override
	public void eat() {
		System.out.println("rat can eat at meat");

	}
}
