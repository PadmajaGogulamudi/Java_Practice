package lab;

//Constru  chaining demo
//class Staff{
//	int id;
//	String name;
//	double salary;
//	
//	public static void main(String[] args) {
//		
//	}
//}
public class Teacher {
	int id;
	String name;
	double salary;
	String Subject;
	int experi;
	double insentives;

	
	Teacher() {
		this(1, "ram");
	}

	
	public Teacher(int id, String name) {
		this(2, "developer", 500);
		this.id = id;
		this.name = name;

	}

	public Teacher(int id, String Subject, int insentives) {
		this(5, "paddu", 400, 10);

		this.id = id;
		this.Subject = Subject;
		this.insentives = insentives;

	}

	public Teacher(int id, String name, int insentives, int experi) {

		this.id = id;
		this.name = name;
		this.insentives = insentives;
		this.experi = experi;
	}

	public static void main(String[] args) {

		Teacher t1 = new Teacher();
		t1.show();
	}

	private void show() {
		System.out.println("id: " + id + "\nname : " + name + "\nsalary :" + salary + "\njob : " + Subject + "\nexperi : "
				+ experi + "\ninsentives :" + insentives);

	}

}
