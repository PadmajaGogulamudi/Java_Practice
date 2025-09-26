package stringHandling;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="00005245abc";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit( s.charAt(i)) && s.charAt(i)=='0' ) {
				count++;
			}else {
				break;
			}
		}
		System.out.println(s.substring(count));

	}

}
