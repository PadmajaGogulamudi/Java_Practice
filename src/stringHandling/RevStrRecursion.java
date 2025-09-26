package stringHandling;

public class RevStrRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		System.out.println(revstr(s));

	}

	private static String revstr(String s) {
		// TODO Auto-generated method stub
		if (s == null || s.length() <= 1) {
			return s;
		}
		return revstr(s.substring(1)) + s.charAt(0);

	}

}
