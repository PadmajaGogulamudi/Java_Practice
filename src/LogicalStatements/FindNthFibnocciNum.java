package LogicalStatements;

//0 1 1 2 3 5 8
import java.util.Scanner;

public class FindNthFibnocciNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter which position fibnocii number you want :");
		int n = sc.nextInt();
		findFib(n);
		sc.close();
	}

	private static void findFib(int n) {
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		int count = 0;
		while (true) {
			count++;
			if (count == n) {
				System.out.println(f1);
				break;
			}
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;

		}
	}

}
