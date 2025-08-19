package Inheritence2;

import Inheritence1.Employee;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		Manager m1 = new Manager();
		m1.setName("XYZ");
		m1.setId(46);
		m1.setSalary(700000);
		m1.setDept("IT");
		
		e1.setName("ABCD");
		e1.setId(1);
		e1.setSalary(400000);
		
		
		
		System.out.println("Employee Infp");
		e1.display();
		System.out.println("*************************");
		System.out.println("Manager Infp");
		m1.display();

	}
}
