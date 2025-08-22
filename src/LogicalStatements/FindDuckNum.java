package LogicalStatements;

public class FindDuckNum {

	public static void main(String[] args) {

		int count = 0;
		int i = 0;
		while (count < 50) {
			if (isDuckNum(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
			
		}

	}

	private static boolean isDuckNum(int n) {
		boolean flag = false;
		while (n != 0) {
			if (n % 10 == 0)
				flag = true;
			n /= 10;
		}
		return flag;
	}

}
