package com.collections.mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Student {
	int id;
	String sname;
	float salary;

	public Student(int id, String sname, float salary) {
		super();
		this.id = id;
		this.sname = sname;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return " sname=" + sname + ", salary=" + salary;
	}

}

public class StudentObj_List_to_Map {
//adding list of  student object to  a map with sid as key and student obj as value
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String c = null;
		List<Student> list = new ArrayList<>();

		do {
			System.out.println("enter sid : ");
			int id = sc.nextInt();
			System.out.println("enter sname : ");
			String sname = sc.next();
			System.out.println("enter salary : ");
			float salary = sc.nextFloat();
			Student s1 = new Student(id, sname, salary);

			list.add(s1);
			System.out.println("want to add again [y/n]");
			c = sc.next();

		} while (c.equalsIgnoreCase("y"));
		Map<Integer, Student> map = new HashMap<>();
		for (Student s : list) {
			map.put(s.id, s);
		}
		for (Map.Entry<Integer, Student> ent : map.entrySet()) {
			System.out.println(ent.getKey() + " : " + ent.getValue().toString());
		}
		

		sc.close();

	}

}
