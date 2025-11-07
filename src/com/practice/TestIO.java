package com.practice;

import java.io.*;

public class TestIO {
	public static void main(String[] args) throws Exception {
		try (FileWriter fw = new FileWriter("tmp.txt")) {
			fw.write("hello");
		} // auto-close in try-with-resources
		System.out.println(new File("tmp.txt").exists());
	}
}
