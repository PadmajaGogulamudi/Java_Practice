package stringHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_digit_from_String {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter number : ");
			String num = sc.nextLine();
			System.out.println("enter digit : ");
			char c = sc.next().charAt(0);
			System.out.println("******");
//			if (num.contains(c + "")) {
//				int index = num.indexOf(c);
//				System.out.println(num.substring(0, index) + num.substring(index + 1));
//			} else {
//				System.out.println("digit not present ");
//			}
			List<Integer> indexs=new ArrayList<>();
			char[] arr=num.toCharArray();
			//int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==c) {
					indexs.add(i);
				}
			}
			System.out.println("***---**");

			int large=0;
			for(int i=0;i<indexs.size();i++) {
				int str=Integer.parseInt((num.substring(0, indexs.get(i)) + num.substring(indexs.get(i) + 1)));
				if(str>large) {
					large=str;
				}
			}
			System.out.println(large);
			
			
		}
	}

}
