package com.GUT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day10_streamsPractice {

	public static void main(String[] args) {
		//List<String> names = Arrays.asList("Ram", "Shyam", "John");
		// names.add("paddu");UnsupportedOperationException
		// names.remove(0); structure can not change
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		Map<Boolean, List<Integer>> map = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println(map);
		System.out.println("-------------A------------------");

		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1);

		list.stream().distinct().forEach(System.out::println);
		System.out.println("--------------B-----------------");
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
		System.out.println("---------------C------------------");
		// Employee e = new Employee(1, "paddu", "IT", 500000, 21);
		List<Employee> listOfEmployees = new ArrayList<>(Arrays.asList(
				new Employee(1, "paddu", "IT", 500000, 21),
				new Employee(2, "reddy", "CSE", 300000, 23),
				new Employee(5, "ram", "IT", 800000, 24),
				new Employee(5, "bhanu", "IT", 800000, 24),
				new Employee(5, "bhanu", "IT", 800000, 24),
				new Employee(3, "raji", "MECH", 50000, 20),
				new Employee(3, "rani", "MECH", 50000, 20),
				new Employee(10, "subbu", "CIVIL", 50000, 21)));
		listOfEmployees.stream().filter(e -> e.getDepartment().equals("IT")).map(Employee::getName)
				.forEach(System.out::println);
		System.out.println("--------------Highest salary------------------");
		Employee highest = listOfEmployees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
		System.out.println(highest);// max is a terminal operation
		System.out.println("--------------count of emps on dept wise------------------");
		Map<String, Long> count = listOfEmployees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(count);
		System.out.println("-------solution1-------------------");
		List<String> departments = listOfEmployees.stream()
		        .filter(e -> e.getSalary() > 60000)           // salary filter
		        .filter(e -> e.getName().startsWith("r"))     // name filter
		        .map(Employee::getDepartment)                 // extract department
		        .distinct()                                   // remove duplicates
		        .sorted()                                     // sort alphabetically
		        .collect(Collectors.toList());                // terminal operation

		System.out.println(departments);
		System.out.println("-------solution2-------------------");
		List<Employee> emps=listOfEmployees.stream()
				.filter(e->e.getSalary()>6000)
				.filter(e-> e.getName().startsWith("r"))
				.distinct()
				.sorted(Comparator.comparing(Employee::getDepartment))
				.collect(Collectors.toList());
		System.out.println(emps);



	}

}
