package exceptionHandling;

import java.security.DrbgParameters.NextBytes;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("enter a value : ");
			int a = sc.nextInt();
			System.out.println("enter b value : ");

			int b = sc.nextInt();
			System.out.println("enter c String  value : ");
			String c = sc.next();
			
			System.out.println(a/b);
		}
		finally {
			System.out.println("finally block!!!");
		}
			
//		}catch(Exception e) {
//			System.out.println("hjhcbh");
//			e.printStackTrace();
//	}
		//catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		System.out.println("ending!!!!!!!!!!!");

	}

}
