package com.practice;
public class M7 {
    public static void main(String[] args) {
        String s = " \t abc \n ";
        System.out.println("["+s.trim()+"]");   // removes ASCII whitespace
        // strip() removes all Unicode whitespace (Java 11+)
    }
}
