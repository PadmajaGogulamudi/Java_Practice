package stringHandling;

import java.util.Scanner;

//s1=ABCD
//s2=DCBA

public class RevstringsCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter str1 : ");
		String s1=sc.next();
		System.out.print("enter str2 : ");
		String s2=sc.next();
		char[] c=s1.toCharArray();
		char temp=' ';
		for(int i=0;i<s1.length()/2;i++) {
			temp=c[s1.length()-1-i];
			c[s1.length()-1-i]=c[i];
			c[i]=temp;
			
			
		}
		//s1=c.toString();
		System.out.println(String.valueOf(c).equals(s2));
		sc.close();

	}

}
