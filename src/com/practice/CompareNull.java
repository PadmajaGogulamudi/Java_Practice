package com.practice;

import java.util.Objects;

public class CompareNull {
    public static void main(String[] args) {
        String s = null;
        System.out.println(Objects.equals(s, "a")); // safe compare
    }
}
