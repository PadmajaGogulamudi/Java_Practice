package stringHandling;

public class Demo1 {
	public static void main(String[] args) {
		String str1 = "aaa0bbb2c3";
		String str2 = "";

		for (int i = 0; i < str1.length(); i++) {

			if (Character.isDigit(str1.charAt(i))) {
				int len=finddigitLength(str1, i);

				int k = Integer.parseInt(str1.charAt(i) + "");
				if (len != 0) {
					k = Integer.parseInt(str1.substring(i, len+i+1));
				}
				for (int j = 0; j < k; j++) {
					str2 = str2 + str1.charAt(i - 1);
				}
				i = i+len;

			}
		}
		System.out.println(str2);
	}

	private static int finddigitLength(String str1, int i) {
		int count = -1;
		for (int j = i; j < str1.length(); j++) {
			if (Character.isDigit(str1.charAt(j))) {
				count++;
			} else {
				break;
			}
		}
		return count;

	}
}
