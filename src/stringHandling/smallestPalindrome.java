package stringHandling;

import java.util.Arrays;

//input : malayalam
//output : ala
public class smallestPalindrome {

	public static void main(String[] args) {

		String s="malayalam";
		String []a=new String[s.length()];
		for(int i=0,index=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ispolynidrom(s, i, j)) {
					a[index++]=s.substring(i,j+1);
				}
			}
		}
		System.out.println(Arrays.toString(a));
	
	String minpoly=a[0];
	if(minpoly!=null) {
	for(String s1:a) {
		if(s1!=null) {
		if(s1.length()<minpoly.length()){
			minpoly=s1;
		}
		}
	}
	System.out.println(minpoly);
	}
	else {
		System.out.println("no polyndrom accor");
	}

	System.out.println(s.indexOf(minpoly));
	}
	
	public static boolean ispolynidrom(String s,int i,int j) {
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
		return true;
	}

//	
}
