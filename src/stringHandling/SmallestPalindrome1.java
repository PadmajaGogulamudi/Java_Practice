package stringHandling;

public class SmallestPalindrome1 {

	public static void main(String[] args) {
		
		System.out.println(findSmallestPalindrome("malayalam"));
		
	}
		private static String findSmallestPalindrome(String str) {
		
			//
					String pali = "";
					for (int i = 0; i < str.length() - 1; i++) {
			
						for (int j = str.length(); j > i + 1; j--) {
							String subStr = str.substring(i, j);
							String revStr = revStr(subStr);
							if (revStr.equals(subStr)) {
								if (pali.isEmpty() || pali.length() > subStr.length())
									pali = subStr;
							}
						}
					}
					if(!pali.isEmpty())
						return pali; 
					else
			
					return "not found ";
				}
			
				private static String revStr(String substring) {
					String rev = "";
					for (int i = substring.length() - 1; i >= 0; i++) {
						rev += substring.charAt(i);
					}
			
					return rev;
				}

	}

