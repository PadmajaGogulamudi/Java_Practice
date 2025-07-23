package lab;

//10-7-2025
public class ConstDemo2 {
	String name;
	int rollNum;
	String course;

	ConstDemo2(String name) {
		this.name = name;

	}

	public ConstDemo2(String name, int rollNum) {
		super();
		this.name = name;
		this.rollNum = rollNum;
	}

	public ConstDemo2(String name, int rollNum, String course) {
		super();
		this.name = name;
		this.rollNum = rollNum;
		this.course = course;
	}

	void show() {
		System.out.println(
				"Name : " + name + "\nRoll num : " + rollNum + "\nCourse : " + course + "\n********************");

	}

	public static void main(String[] args) {

		ConstDemo2 d1 = new ConstDemo2("Abcd");

		ConstDemo2 d2 = new ConstDemo2("efgh", 1);
		ConstDemo2 d3 = new ConstDemo2("kdsf", 2, "jfs");
		d1.show();
		d2.show();
		d3.show();

	}

}
