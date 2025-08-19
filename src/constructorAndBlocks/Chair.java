package constructorAndBlocks;

class Thing {
	String name;
	int count;
	double price;

	public Thing() {
		super();
	}

	public Thing(String name, double price) {
		this.name = name;
		this.price = price;
	}

}

public class Chair extends Thing {
//	String name;
//	int count;
//	double price;

	Chair() {
		// super("hsdcb",873);
		System.out.println("no arg const from chair");

	}

	Chair(String name, double price) {
		super(name, price);
	}

	public static void main(String[] args) {
		Chair c = new Chair("Wood", 20000);
		System.out.println(c.name);

		System.out.println(c.count);

		System.out.println(c.price);
		System.out.println("***********************");
		Chair c1 = new Chair();
		System.out.println(c1.name);

		System.out.println(c1.count);

		System.out.println(c1.price);

	}

}
