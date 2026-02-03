package stringHandling;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given a string s and an integer k
//
//👉 Count distinct substrings
//👉 which have exactly k unique characters
//input :
//s = "pqpqs"
//k = 2
//output : 
//pq, pqp, qp, pqpq, qpqs, pqs
public class SubStrings_with_Unique_k_chars {

	public static void main(String[] args) {

		String s = "pqpqs";
		int k = 2;

		Map<String, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j < s.length(); j++) {
				String sub = s.substring(i, j + 1);

				System.err.println(sub);
				if (isValid(sub, k)) {
					
					if (!(set.add(sub)))
						continue;

					
				}
			}
		}
		for (String s1 : set) {
			System.out.println(s1.toString());

		}
		System.out.println(set.size());

	}


	private static boolean isValid(String sub, int k) {
		int count = 0;
		String s = "";
		for (int i = 0; i < sub.length(); i++) {
			if (s.indexOf(sub.charAt(i) + "") == -1) {
				s += sub.charAt(i);
				count++;
			}
		}
		if (count == k)
			return true;
		return false;
	}

}
