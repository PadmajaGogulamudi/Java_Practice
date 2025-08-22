package oops.interfaces;

public interface Animal {
public void eat();
public void sleep();
public default void sound() {
	//1.8
	System.out.println("default method from animal interface");
	grow();
}
public static void birth() {
	//1.8
	System.out.println("static method from animal interface");
	
}
private void grow() {
	System.out.println("animal is growing !!!!!!!!");
}


}
