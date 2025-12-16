package stringHandling;
//abc
//acb
//bac
//bca
//cba
//cab

public class Permutaion_combination_abc {

	public static void main(String[] args) {
		String s = "abc";
		getans(s, 0, (s.length() - 1));

	}

	private static void getans(String s, int start, int end) {
		if (start == end) {
			System.out.println(s);
			return;
		}
		for (int i = start; i <= end; i++) {
			String s1 = swap(s, i, start);
			getans(s1, start + 1, end);
		}

	}

	private static String swap(String s, int i, int start) {
		char[] c = s.toCharArray();
		char temp = c[i];
		c[i] = c[start];
		c[start] = temp;

		return new String(c);
	}

}
