package stringHandling;

public class UnicodeOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcxyzABCXYZ";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.codePointAt(i));
		}
		

	}

}
