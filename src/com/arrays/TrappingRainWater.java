package com.arrays;
 public class TrappingRainWater {
    static int trap(int[] height) {
        int n = height.length;
        int water = 0;

        for (int i = 0; i < n; i++) {

            int leftMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            int rightMax = 0;
            for (int j = i; j < n; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            water += Math.min(leftMax, rightMax) - height[i];
        }
        return water;
    } 

    public static void main(String[] args) {
        int[] arr = {1,8,7,6,11,10,12,9};
        System.out.println(trap(arr));
    }
}
