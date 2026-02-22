package com.comparableComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.GUT.Employee;

public class ComparableDemo1 {

	public static void main(String[] args) {
//		Comparable<Integer> comp=new Comparable<>() {
//
//			@Override
//			public int compareTo(Integer o) {
//				System.out.println("comparing : "+o);
//				return 0;
//			}
//			
//		};
		Comparator<Employee> deptComp=(e1,e2)->e2.getDepartment().compareTo(e1.getDepartment());
		Comparator<Employee> salComp=new Comparator<>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getSalary()>o2.getSalary()?1:(o1.getSalary()==o2.getSalary())?0:-1;
			}
			
		};

		Integer[] arr = { 2, 5, 1, 4, 8, 3 };
		// Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------------");
		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
		System.out.println(list);
		Collections.sort(list);
			
		System.out.println(list);
		System.out.println("---------------------for custome objs--------------------");
		List<Employee> listOfEmployees = new ArrayList<>(
				Arrays.asList(new Employee(1, "paddu", "IT", 500, 21), new Employee(2, "reddy", "CSE", 300, 23),
						new Employee(10, "subbu", "CIVIL", 550, 21), new Employee(5, "ram", "IT", 550, 24),
						new Employee(3, "raji", "MECH", 400, 20), new Employee(3, "rani", "MECH", 100, 20)));
		
		// Collections.sort( listOfEmployees);//classCastException
		System.out.println("---------------------afetr class cast Exception--------------------");
		// Emp obj can not convert to comparable type so
		// that class should implements comparable interface and override compareTo
		// method
		//Collections.sort(listOfEmployees);
		System.out.println(listOfEmployees);
		System.out.println(
				"---afetr implements Comparable interface to Employee class now using comparator---");
		System.out.println("----using comparator----");
		Collections.sort(listOfEmployees, salComp.thenComparing(deptComp));
		System.out.println(listOfEmployees);

		
	}

}
