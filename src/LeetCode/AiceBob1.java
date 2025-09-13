package LeetCode;


public class AiceBob1 {
	public static boolean doesAliceWin(String s) {
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                return true; // Alice has at least one move
            }
        }
        return false; // No vowels -> Alice cannot move
    }
	public static void main(String[] args) {
		System.out.println(doesAliceWin("leetcoder"));
	

	}

}
