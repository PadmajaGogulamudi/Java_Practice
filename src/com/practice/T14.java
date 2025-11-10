package com.practice;

import java.util.Arrays;

public class T14 {
    public static void main(String[] args) {
        String s = "a.b.c";
        String[] arr = s.split(" ");
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
