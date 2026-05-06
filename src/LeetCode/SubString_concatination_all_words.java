package LeetCode;
//Input: "abc"

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Output:
//abc
//acb
//bac
//bca
//cab
//cba

public class SubString_concatination_all_words {
	static List<Integer> list = new ArrayList<>();

//	// Recursive function to print all permutations
//	public static void permute(String str, String result) {
//		// Base condition: when string is empty, print the result
//		if (str.isEmpty()) {
//			System.out.println(result);
//			return;
//		}
//
//		// Fix each character one by one
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//
//			// Remaining string after removing the fixed character
//			String remaining = str.substring(0, i) + str.substring(i + 1);
//
//			// Recur with remaining string and updated result
//			permute(remaining, result + ch);
//		}
//	}

	public static void main(String[] args) {
		List<String> words = new ArrayList<>(Arrays.asList("bar", "foo", "the"));
		String s = "barfoofoobarthefoobarman";
		findSubString(words, s); // Initial call with empty result
		System.out.println(list);
	}

	private static void findSubString(List<String> words, String s) {
		permute(words, s, new ArrayList<>());

	}

	private static void permute(List<String> words, String s, List<String> result) {
		if (words.size() == 0) {
			// System.out.println(result);
			
			String l = "";
			for (String m : result) {
				l += m;
			}
			System.out.println(l);
			if (s.indexOf(l) != -1)
				list.add(s.indexOf(l));
			result.clear();

			return;
		}
		for (int i = 0; i < words.size(); i++) {
			String ch = words.get(i);
			// List<String> remain=new ArrayList<>(substring(words,0, i), substring(words,i
			// + 1,(words.size())-1);

			List<String> remain = new ArrayList<>();
			remain.addAll(substring(words, 0, i));
			remain.addAll(substring(words, i + 1, (words.size())));
			result.add(ch);
			permute(remain, s, result);
		}

	}

	private static List<String> substring(List<String> words, int i, int i2) {
		List<String> s = new ArrayList<>();
		for (int k = i; k < i2; k++) {
			s.add(words.get(k));
		}
		return s;
	}

}
