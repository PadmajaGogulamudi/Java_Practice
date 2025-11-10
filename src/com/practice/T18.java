package com.practice;
public class T18 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("helloa3abcdshelloa3abcds");
        //sb.ensureCapacity(20);
        System.out.println(sb.capacity()); // >=20
    }
}
