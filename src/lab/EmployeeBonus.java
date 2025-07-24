package lab;

import java.util.Scanner;

public class EmployeeBonus {
	int employeeId;
	int projComptd;
	int overTimeHrs;
	double salary;
	float b;

	public EmployeeBonus(int employeeId, int projComptd, int overTimeHrs, double salary) {
		this.employeeId = employeeId;
		this.projComptd = projComptd;
		this.overTimeHrs = overTimeHrs;
		this.salary = salary;
	}

	void bonus() {
		b = (float) ((projComptd > 3 && overTimeHrs >= 10) ? ((salary * 10) / 100)
				: (projComptd > 3 || overTimeHrs >= 10) ? ((salary * 5) / 100) : 0);
		projComptd++;
	}

	double to() {
		return (float) (salary + b);
	}

	void show() {
		System.out.println("Employee ID = " + employeeId + "\nNo. of Projects = " + projComptd + "\nOver Time = "
				+ overTimeHrs + "\nSalary = " + salary + "\nBonus = " + b + "\nTotal Salary = " + to());
		;
	}

	public static void main(String[] args) {
		EmployeeBonus b1 = new EmployeeBonus(67, 2, 10, 40000);
		b1.bonus();
		b1.show();

	}

}