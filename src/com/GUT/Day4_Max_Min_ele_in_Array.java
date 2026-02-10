package com.GUT;

public class Day4_Max_Min_ele_in_Array {

	public static void main(String[] args) {
		int[] arr= {10,45,20,8,45,30};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>fmax) {
				smax=fmax;
				fmax=arr[i];
				
			}
			else if(arr[i]>smax && arr[i]!=fmax) {
				smax=arr[i];
			}
			
			if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println("fmax ="+fmax+"\nsmax ="+smax+"\nmin= "+min);
	}

}
