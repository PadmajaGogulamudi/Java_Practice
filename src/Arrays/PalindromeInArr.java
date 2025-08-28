package Arrays;

public class PalindromeInArr {

	public static void main(String[] args) {
		int[] arr = { 121, 222, 123 };
		for (int i : arr) {
			if (isPalindrome(i))
				System.out.print(i + " ");
		}

	}

	private static boolean isPalindrome(int i) {
		String temp = Integer.toString(i);
		String rev = "";

		while (i != 0) {
			rev += Integer.toString(i % 10);
			i /= 10;

		}
		return temp.equals(rev);
	}

}
