package stringHandling;


public class LongestWordRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "I love java";
		String[] arr = s1.split(" ");
		int maxlen = arr[0].length();
		for (String s : arr) {
			if (s.length() > maxlen) {
				maxlen = s.length();
			}
		}
		String[] temp = new String[arr.length];
		int index = 0;
		for (String s : arr) {
			if (s.length() == maxlen) {
				temp[index++] = s;
			}
		}

		String str = findStr(temp, maxlen);

		String result = removeDuplicate(str);

		System.out.println(result);

	}

	private static String removeDuplicate(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (s.indexOf(str.charAt(i)) == -1) {
				s += str.charAt(i);
			}
		}

		return s;
	}

	private static String findStr(String[] temp, int maxlen) {
		int x = 0;
		for (String s : temp) {
			if (s != null) {
				x++;
			}
		}
		String[] arr = new String[x];
		for (int i = 0, j = 0; i < temp.length; i++) {
			if (temp[i] != null) {
				arr[j++] = temp[i];
			}
		}
		String str = arr[0];

		for (String s : arr) {
			if (str.compareToIgnoreCase(s) > 0) {
				str = s;
			}
		}
		return str;
	}

}
