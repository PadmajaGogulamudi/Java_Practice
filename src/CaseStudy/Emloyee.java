package CaseStudy;

public class Emloyee {
	int empId;
	int projectsCompleted;
	int overTimeHours;
	double basicSalary;
	float annualSalary;
	float bonus;

	public Emloyee(int empId, int projectsCompleted, int overTimeHours, int basicSalary) {

		this.empId = empId;
		this.projectsCompleted = projectsCompleted;
		this.overTimeHours = overTimeHours;
		this.basicSalary = basicSalary;

	}

	void calcuBonus() {
		bonus = (projectsCompleted > 3 && overTimeHours >= 10) ? (float) ((basicSalary * 10) / 100)
				: (projectsCompleted > 3 || overTimeHours >= 10) ? (float) ((basicSalary * 5) / 100) : 0;

		projectsCompleted++;

	}

	void totalSal() {
		annualSalary = (float) (basicSalary + bonus);
	}

	void show() {
		totalSal();
		System.out.println("emp number : " + empId);
		System.out.println("Projects Completed : " + projectsCompleted);
		System.out.println("Annual Salary : " + annualSalary);

	}

	public static void main(String[] args) {
		Emloyee e1 = new Emloyee(1, 5, 10, 50000);
		e1.calcuBonus();
		e1.show();

	}

}
