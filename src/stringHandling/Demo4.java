package stringHandling;

public class Demo4 {

	public static void main(String[] args) {
		String s="computers";
		
		String s1="";
		
		
		for(int i=0;i<s.length()-1;i=i+2) {
			s1=s1+s.charAt(i+1)+s.charAt(i);
			
		}
		System.out.println(s1+s.charAt(s.length()-1));

	}

}
