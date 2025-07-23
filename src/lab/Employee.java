package lab;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Employee {
//	Integer i1=new Integer("1");
	String s1 = "Ram";
	BigInteger i1 = new BigInteger("1");

	// Double Experience=new Double("6");
	BigDecimal Experience = new BigDecimal(5);

	{
		Double d = new Double(5000 * 12);
		// Double d=50000*12; ela kuda cheyyachu indhaka last lo D ivvala nenu andhuke
		// error vachindhi
		Double anualSal = d + (d * 10) / 100;
		Double bonus = (d * 10) / 100;
		System.out.println("Emp name: " + s1 + "\nEmp ID : " + i1 + "\nExperience: " + Experience);
		System.out.println("Annual Salary: " + d + "\nAnnual Bonus: " + bonus + "\nTotal Annual Salary: " + anualSal);

	}

	public static void main(String[] args) {
		Employee e = new Employee();

	}

}
