package lab;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Demo1 {
	String s1 = "Ram";
	BigInteger i1 = new BigInteger("1");
	BigDecimal Experience = new BigDecimal(5);
	{
		BigDecimal d=new BigDecimal(5000*12);
		BigDecimal b=new BigDecimal(10);
		BigDecimal c=new BigDecimal(100);
		BigDecimal bonus=(b.multiply(d)).divide(c);
		BigDecimal anualSal=d.add(bonus);
		System.out.println("Emp name: " + s1 + "\nEmp ID : " + i1 + "\nExperience: " + Experience);
		System.out.println("Annual Salary: " + d + "\nAnnual Bonus: " + bonus + "\nTotal Annual Salary: " + anualSal);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 e = new Demo1();
	}

}
