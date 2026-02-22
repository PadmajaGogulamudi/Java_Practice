package com.GUT;

import java.util.Comparator;
import java.util.List;

public class Day_9_streams {

	public static void main(String[] args) {
		// String str = "java iis simple";
		// int[] arr = { 1, 4, 3, 8, 0, 4, 7 };
		List<Integer> list = List.of(1, 4, 3, 8, 6, 4, 7);

		// long count = list.stream().filter(t -> t % 2 == 0).count();
		// str.stream().
		// Arrays.stream(arr).map(a -> a * a).forEach(System.out::println);
		// System.out.println(count);
		//forEach->consumer
		list.stream().filter(t -> t % 2 == 0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("-----------HH---------");
		list.stream().map(n->n*n+"A").peek(System.out::println).forEach(System.out::println);
		System.out.println("--------------------");
		list.stream().forEach(n->System.out.println(n));
		System.out.println("--------------------");
		List<Integer> numbers = List.of(1, 4, 3, 8, 6, 4, 7);
		//Function<Integer> 

//		numbers.stream()
//	       .map(list -> list.stream())
//	       .forEach(System.out::println);
		
		
	}

}
