package Inheritence2;

public class Rectangle extends Shape {


	

	@Override
	double perimeter() {
		System.out.println("Rectangle perimeter printing!!");
		return 4;
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 0;
	}

}
