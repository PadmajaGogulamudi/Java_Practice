package com.arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
    	int n = digits.length;

        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // increment and return
                return digits;
            }
            digits[i] = 0; // set 9 → 0 and continue
        }

        // If all digits were 9, we need a new array
        int[] newarr = new int[n + 1];
        newarr[0] = 1; // Example: 999 → 1000

       
    return newarr;

        
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	int[] arr1= {9};
    	int[] newarr=s.plusOne(arr1);
    	for(int n:newarr) {
    		System.out.print(n+" ");
    	}
		
	}
}