package stringHandling;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AS12DE1F25G5";
		String s1="";
		String num="";
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				num+=s.charAt(i);
			}else {
				s1+=s.charAt(i);
			}
		}
		System.out.println(s1+num);
		
	}

}
