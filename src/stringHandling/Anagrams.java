package stringHandling;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
		if(isAnagrams(s1,s2))
			System.out.println("given strings are anagrams");
		else
			System.out.println("not anagrams");

	}

	private static boolean isAnagrams(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
		for(int i=0;i<s1.length();i++) {
			if(!(s1.contains(s2.charAt(i)+""))) {
				return false;
			}
				
		}
		
		
		return true;
	}

}
