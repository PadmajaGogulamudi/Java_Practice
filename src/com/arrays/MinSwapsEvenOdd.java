package com.arrays;

public class MinSwapsEvenOdd {

	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 1, 6,0,5};
		int left=0;
		int right=arr.length-1;
		int swaps=0;
		while(left<right) {
			//moving left forward until odd is found
			while(left<right && arr[left]%2==0) {
				left++;
			}
			
			//moving right back until even is found
			while(left<right && arr[right]%2==1) {
				right--;
			}
			
			if(left<right) {
				// swap odd on left with even on right
				arr[right]=arr[right]+arr[left]-(arr[left]=arr[right]);
				swaps++;
				
				
			}
		}
		System.out.println("required swaps to move odds evens separate side : "+swaps);
	}

}
