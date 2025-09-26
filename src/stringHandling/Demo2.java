package stringHandling;

public class Demo2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s="abc";
//		System.out.println(s.contains("a"));
//		contains expects String value not character
		String s = "DHONI";

		char c = 'A';
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i == j || i == s.length() - j - 1) {
					System.out.print(s.charAt(i)+" ");
				} else {
					System.out.print(c+++" ");
				}
			}

			System.out.println();

		}

	}

}
