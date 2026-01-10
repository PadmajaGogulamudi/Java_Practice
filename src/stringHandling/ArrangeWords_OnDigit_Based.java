package stringHandling;

public class ArrangeWords_OnDigit_Based {

	public static void main(String[] args) {
		String[] strs="am2 I1 to4 going3 hyd5".split(" ");
		int i=strs.length;
		String finalStr="";
		while(i>0) {
			for(String s:strs) {
				if(s.contains(i+""))
				{
					finalStr=s.substring(0,s.length()-1)+" "+finalStr;
					i--;
				}
			}
			
		}
		System.out.println(finalStr);
	}

}
