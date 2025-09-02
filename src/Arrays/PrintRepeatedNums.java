package Arrays;

import java.util.Arrays;

public class PrintRepeatedNums {

	public static void main(String[] args) {
		int[] arr = { 44, 4, 4, 2, 2, 7, 7, 2, 9, 4, 7, 3 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			while(i<arr.length-1 && arr[i]==arr[i+1]) {
				count++;
				i++;
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
//			System.out.println(arr[i]+" and count is : "+count);
		}
	}

	// String s = "";
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//
//					count++;
//
//				}
//
//			}
//			if (count > 0) {
//				if (!(s.contains(Integer.toString(arr[i])))) {
//					System.out.print(arr[i]+" ");
//					s+=Integer.toString(arr[i]);
//					
//				}
//				
//
//			}
//		}

}
