package com.GUT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day11_Sum_Even_streams {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(list.stream().filter(n->n%2==0).reduce(0, Integer::sum));
	}

}
