package CaseStudy;

import java.util.Scanner;

class StudentDetails {
	
	private String stuName;
	private int age;
	private String rollNum;
	private float GPA;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public boolean setAge(int age) {

		if (age <= 0) {
			System.out.println("invalid age enter again :");
			return false;
		}
		this.age = age;
		return true;
	}

	public String getRollNum() {
		return rollNum;
	}

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}

	public float getGPA() {
		return GPA;
	}

	public boolean setGPA(float gPA) {
		if (gPA < 0.0 || gPA > 10.0) {
			System.out.println("invalid GPA!!\nGPA must be between 0.0-10.0\nEnter again : ");
			return false;
		}
		GPA = gPA;
		return true;
	}

}

public class StudentManagementSystem {
	public void displayDetails(StudentDetails s1) {

		System.out.println("*****Student Details*****");
		System.out.println("Student Name : " + s1.getStuName());
		System.out.println("Student Age : " + s1.getAge());
		System.out.println("Student RollNumber : " + s1.getRollNum());
		System.out.println("Student GPA : " + s1.getGPA());
	}

	public static void main(String[] args) {
		
		boolean Status = false;
		StudentManagementSystem sm1 = new StudentManagementSystem();
		Scanner sc = new Scanner(System.in);
		System.out.println("---Welcome to Student Database---");
		StudentDetails s1 = new StudentDetails();
		System.out.println("enter Student Name : ");
		
		s1.setStuName(sc.nextLine());
		System.out.println("enter Student Age : ");
		do {
			
			Status = s1.setAge(sc.nextInt());
		} while (!Status);
		System.out.println("enter Student rollNum : ");
		
		s1.setRollNum(sc.next());
		System.out.println("enter Student GPA : ");
		do {
			
			Status = s1.setGPA(sc.nextFloat());
		} while (!Status);
		sm1.displayDetails(s1);
		sc.close();
	}

}
