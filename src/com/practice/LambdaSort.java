package com.practice;

import java.util.*;
public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bob","anna","clara");
        Collections.sort(names, (x,y) -> y.compareTo(x)); // reverse
        System.out.println(names);
    }
}