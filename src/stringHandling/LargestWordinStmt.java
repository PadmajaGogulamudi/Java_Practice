package stringHandling;

public class LargestWordinStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="find the second largest  yyhiiiiiiiiiiiiii word";
		String[] s1=s.split(" ");
		int first=0;
		int second=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i].length()>s1[first].length() ){
				second=first;
				first=i;				
			}
		}
		System.out.println("first largest : "+s1[first]);
		System.out.println("second largest : "+s1[second]);


	}

}
