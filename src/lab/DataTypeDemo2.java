package lab;

import java.util.Scanner;

public class DataTypeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c= new Scanner(System.in);
		double weight=c.nextInt();
		double Kg=weight/1000;
		double mg=Kg/1000;
		System.out.println("in KG : "+Kg);
		System.out.println("in mG : "+mg);

c.close();
	}

}
