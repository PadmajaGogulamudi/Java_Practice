package Class_Assignment;

import java.util.Scanner;

public class FindAge {
	int age;
	Scanner sc = new Scanner(System.in);

	FindAge() {
		System.out.println("enter age : ");
		this.age = sc.nextInt();

	}

	String calAge() {

		if (age < 0)
			return "Invalid age";
		else {
			if (age > 60)
				return "old age";
			else if (age > 45 & age <= 60)
				return "middle Age";
			else if (age > 20 & age <= 45)
				return "young age";
			else if (age > 13 & age <= 20)
				return "teen age";
			else if (age > 6 & age <= 13)
				return "children ";
			else
				return "kid";
		}

	}

	public static void main(String[] args) {

		FindAge f1 = new FindAge();
		System.out.println(f1.calAge());

	}

}
