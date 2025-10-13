package stringHandling;

public class Longest_word_with_vowel_nonrepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = "Smart people plan daily work perfectly".split(" ");
		String result = "";

		for (int i = 0; i < s.length; i++) {

			String res = findWord(s[i]);

			if (res != null && res.length() > result.length()) {
				result = res;
			}

		}
		System.out.println(result);

	}

	private static String findWord(String str) {

		String rep = "";
		boolean flag = false;
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if (rep.indexOf(c) == -1) {
				rep += c;
				if ("aeiou".indexOf(c) != -1) {
					flag = true;
				}
			} else {
				return null;
			}

		}
		if (flag) {
			return str;
		}
		return null;

	}

}
