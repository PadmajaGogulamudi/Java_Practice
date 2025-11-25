package com.threads;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<String> q = new ArrayList<>();
		q.add("A");
		q.add("B");
		q.add("C");
		for(String s:q) {
			if(s.equals("B")) {
				q.remove(s);
			}

		}
		System.out.println(q);

	}

}
