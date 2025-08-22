package constructorAndBlocks;

public class Laptop {
	String name;
	int id;

	Laptop() {
		//this("Lenovo", 1);
		this.name = "Dell";
		this.id = 4;
	}

	Laptop(String name, int id) {
		 this();
		this.name = name;
		this.id = id;

	}

	public static void main(String[] args) {

//		Laptop l1 = new Laptop();
//		l1.show();
//		
		Laptop l2 = new Laptop("hp",10);
		l2.show();
	}

	void show() {
		System.out.println("*************************");
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		
	}

}
