package com.GUT;

public class Day17_Reverse_str_skipSpecialChars {

	public static void main(String[] args) {
		String str = "vc$123@jre56#";
		char[] chars = str.toCharArray();

		int i = 0, j = chars.length - 1;
		while (i < j) {
			if (Character.isDigit(chars[i]) || Character.isLetter(chars[i])) {
				if (Character.isDigit(chars[j]) || Character.isLetter(chars[j])) {
					char temp = str.charAt(i);
					chars[i] = chars[j];
					chars[j] = temp;
					i++;
					j--;

				} else {
					j--;
				}

			} else {
				i++;
			}

		}
		System.out.println(chars);

	}

}
