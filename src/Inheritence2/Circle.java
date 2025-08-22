package Inheritence2;

public class Circle extends Shape {

	@Override
	double area() {
		System.out.println("Circle Area printing!!");
		return 1.2;
	}

	@Override
	double perimeter() {
		System.out.println("Circle perimeter printing!!");
		return 1;
	}

}
