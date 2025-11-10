package com.practice;
public class M5 {
    public static void main(String[] args) {
        String s = "a.b";
        System.out.println(s.replace(".", "X"));     // aXb   (literal replace)
        System.out.println(s.replaceAll(".", "X"));  // XXX   (regex "." matches any char)
    }
}
