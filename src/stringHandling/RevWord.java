package stringHandling;

public class RevWord{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java is Fun ";
		String[] temp=s.split(" ");//["Java","is","Fun"]
		String s1="";
		for(int i=0;i<temp.length;i++) {
			s1+=" "+reverseWord(temp[i]);
		}
		System.out.println(s1.trim());

	}

	private static String reverseWord(String string) {
		
		String s="";
		for(int i=0;i<string.length();i++) {
			s=string.charAt(i)+s;
		}
		return s;
	}

}
