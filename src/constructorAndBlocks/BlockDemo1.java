package constructorAndBlocks;

class Aaa {
	static {
		System.out.println("hii ");
	}

	{
		System.out.println("hello");
	}
	
}

class BlockDemo12 {
	static {
		System.out.println("how");
		new BlockDemo12();
		System.out.println("paddu");
	}
	{
		new Aaa();
		System.out.println("are you ");

	}

	public static void main(String[] args) {

	}

}
