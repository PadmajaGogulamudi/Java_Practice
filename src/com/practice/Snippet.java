package com.practice;

public class Snippet {
	public static void main(String[] args) {
		String s = "a+b";
		System.out.println(s.replaceAll("+", "X")); // Throws PatternSyntaxException (plus is regex quantifier)
		System.out.println(s.replace("+", "X"));    // literal: "aXb"
		
	}
}

