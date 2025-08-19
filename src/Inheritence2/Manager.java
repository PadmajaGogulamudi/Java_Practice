package Inheritence2;

import Inheritence1.Employee;

class Manager extends Employee {


	private static String dept;

	@Override
	public void setName(String name) {
		super.setName(name); 
	}

	@Override
	public void setId(int id) {
		super.setId(id);
	}

	@Override
	public void setSalary(double salary) {
		super.setSalary(salary);	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		Manager.dept = dept;
	}

	public void display() {

		
		super.display();


		System.out.println("Department : " + dept);

	}

}