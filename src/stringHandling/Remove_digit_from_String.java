package stringHandling;

import java.util.Scanner;

public class Remove_digit_from_String {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter number : ");
			String num = sc.nextLine();
			System.out.println("enter digit : ");//1
			char c = sc.next().charAt(0);
			System.out.println("******");
			
			char[] arr=num.toCharArray();//[1,2,3,3,4,1,2]
			
			int large=0;//233412
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==c) {
					
					int str=Integer.parseInt((num.substring(0, i) + num.substring(i + 1)));//233412,123342
					if(str>large) {
						large=str;
					}
				}
			}
			System.out.println("***--large num -**");

			
			System.out.println(large);
			
			
		}
	}

}
