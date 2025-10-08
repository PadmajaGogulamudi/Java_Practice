package stringHandling;

public class Find_Single_repeated_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		String s1="";
		for(int i=0;i<s.length();i++) {
			int count=0;
			if(!(s1.contains(s.charAt(i)+""))) {
				s1+=s.charAt(i);
				for(int j=i;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j))
						count++;
				}
				System.out.println(s.charAt(i)+"-"+count);
				
			}
			
		}

	}

}
