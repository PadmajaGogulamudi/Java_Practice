package com.practice;
public class B1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");
        sb.append("b").append(3);
        System.out.println(sb.toString()); // "ab3"
    }
}
