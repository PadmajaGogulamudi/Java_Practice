package stringHandling;

public class Find_first_non_repeating_Char {

	public static void main(String[] args) {
		String s="Swiss".toLowerCase();
		String s1="";
		for(int i=0;i<s.length();i++) {
			int count=0;
			if(!(s1.contains(s.charAt(i)+""))) {
				s1+=s.charAt(i);
				for(int j=i;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j))
						count++;
				}
				if(count==1) {
					System.out.println("first non-repeating char : "+s.charAt(i));
					break;

				}
				
			}
		}
		

	}

}
