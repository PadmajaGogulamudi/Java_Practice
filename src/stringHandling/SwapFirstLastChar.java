package stringHandling;

public class SwapFirstLastChar {

	public static void main(String[] args) {

		String s = "Hello World";//oellH dorlW
		String[] temp = s.split(" ");
		String s1 = "";
		for (int i = 0; i < temp.length; i++) {
			s1 += swapChars(temp[i]) + " ";
		}
		System.out.println(s1.trim());

	}

	private static String swapChars(String str) {

		char f = str.charAt(0);
		char l = str.charAt(str.length() - 1);
		str = l + str.substring(1, str.length() - 1) + f;

		return str;
	}

}
