package stringHandling;
//Input: "abc"

//Output:
//abc
//acb
//bac
//bca
//cab
//cba

public class StringPermutations {

    // Recursive function to print all permutations
    public static void permute(String str, String result) {
        // Base condition: when string is empty, print the result
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }

        // Fix each character one by one
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remaining string after removing the fixed character
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recur with remaining string and updated result
            permute(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        permute(input, "");  // Initial call with empty result
    }
}
