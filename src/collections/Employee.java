package collections;

class Employee {
	int empnum;
	String ename;
	char gender;

	Employee(int n, String name, char g) {
		empnum = n;
		ename = name;
		gender = g;

	}

	public String toString() {
		return "Ename : " + ename + " | Enum : " + empnum + " | gender : " + gender;

	}

}
