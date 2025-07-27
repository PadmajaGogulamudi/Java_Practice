package LogicalStatements;

public class MethodRecursiveDemo {
	static int i = 1;

	public static void main(String[] args) {
		printNum();

	}

	private static void printNum() {
		if (i <= 10) {
			System.out.print(i + " ");
			i++;

			printNum();
		}

	}

}
