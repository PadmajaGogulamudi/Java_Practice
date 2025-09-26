package stringHandling;

public class CountOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcxyzABCXYZ".toLowerCase();
		String visited="";
		for(int i=0;i<s.length();i++) {
			if(!(visited.contains( s.charAt(i)+""))) {
				visited+= s.charAt(i);
				int count=0;
				for(int j=i;j<s.length();j++) {
					if((s.charAt(i)+"").equals( s.charAt(j)+"")) {
						count++;
					}
				}
				System.out.println(s.charAt(i)+"-"+count);
			}
		}
		


	}

}
