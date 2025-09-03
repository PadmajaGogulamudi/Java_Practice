package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOutofBounds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3 };
		try {
			System.out.println("enter a value : ");
			int a = sc.nextInt();
			System.out.println("enter c value : ");

			int c = sc.nextInt();
			int d = 0;
			System.out.println(c / d);
//			for (int i = 0; i <= arr.length; i++) {
//				System.out.print(arr[i] + " ");
			// }
		} catch (InputMismatchException e) {
			System.err.println("input error");
			e.printStackTrace();
		} catch (ArithmeticException a) {
			System.out.println("arithmeticException!!");

		} catch (Exception e) {
//			System.err.println("\n"+e.toString());
//			System.out.println("**********");
			e.printStackTrace();

		}
		System.out.println("ending!!!!!!!");
	}

}
