package constructorAndBlocks;
class Parent{
	String name;
	int id;
	Parent(){
		this("ABC",1);
		System.out.println("no arg const from parent class");
	}
	public Parent(String name, int id) {
		this.name=name;
		this.id=id;
	}
}

public class Child extends Parent{
//	String name;
//	int id;
	Child(){
		this("XYZ",2);
		System.out.println("no arg const from child class");

	}

	public Child(String name, int id) {
		super();
//		this.name=name;
//		this.id=id;
	}

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.name);
	}

}
