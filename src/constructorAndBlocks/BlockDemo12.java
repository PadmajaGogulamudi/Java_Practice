package constructorAndBlocks;

class Aaa {
	static {
		System.out.println("static from Aaa ");
	}

	{
		System.out.println("instance from Aaa");
	}

	Aaa() {
		System.out.println("Aaa constructor");
	}

}

public class BlockDemo12 {
	static {
		System.out.println("static from BlockDemo12 before BlockDemo12 object creation ");
		new BlockDemo12();
		System.out.println("static from BlockDemo12 after BlockDemo12 object creation");
	}

	{
		new Aaa();
		System.out.println("instance from BlockDemo12");

	}

	BlockDemo12() {
		System.out.println("this is BlockDemo12() constructor---");
	}

	public static void main(String[] args) {
		System.out.println("hello main method");
	}

}
