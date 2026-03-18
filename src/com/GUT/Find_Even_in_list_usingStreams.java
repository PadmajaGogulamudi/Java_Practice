package com.GUT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Even_in_list_usingStreams {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		list.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
