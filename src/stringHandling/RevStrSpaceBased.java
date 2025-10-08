package stringHandling;

public class RevStrSpaceBased {

	public static void main(String[] args) {
		String str ="i love vcube";
					//e bucv evoli
		String temp=str.replace(" ", "");//ilovevcube
		String result="";
		int mk=temp.length()-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				result=result+" ";
			}else{
				result=result+temp.charAt(mk);
				mk--;
			}
		}
		
		System.out.println(result);

	}

}
