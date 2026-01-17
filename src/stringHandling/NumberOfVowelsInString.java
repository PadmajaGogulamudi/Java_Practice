package stringHandling;

import java.util.Scanner;

public class NumberOfVowelsInString {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter string : ");
			String s = sc.nextLine().toLowerCase();
			String vow="aeiou";
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(vow.indexOf(s.charAt(i))!=-1) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
