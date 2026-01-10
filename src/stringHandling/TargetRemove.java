package stringHandling;

public class TargetRemove {

	public static void main(String[] args) {
		String str="131310";
//		int max=
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='1') {
				System.out.println(str.substring(0,i)+str.substring(i+1));
			}
		}
		
//		System.out.println("string : "+str.substring(5));
		
	}

}
