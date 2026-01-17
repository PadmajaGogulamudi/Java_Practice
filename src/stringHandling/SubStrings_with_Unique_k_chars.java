package stringHandling;

import java.util.HashSet;
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

        Set<String> result = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            Set<Character> unique = new HashSet<>();

            for (int j = i; j < s.length(); j++) {

                unique.add(s.charAt(j));

                if (unique.size() == k) {
                    result.add(s.substring(i, j + 1));
                }

                if (unique.size() > k) {
                    break;
                }
            }
        }

        for (String str : result) {
            System.out.println(str);
        }

        System.out.println("Count = " + result.size());
	}
}
