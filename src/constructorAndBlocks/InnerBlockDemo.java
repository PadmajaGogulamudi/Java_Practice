package constructorAndBlocks;

public class InnerBlockDemo {
	
	public static void main(String[] args) {
		
		show();
	}

	private static void show() {
		
		
		int x=2;
		
		{//z can not be accessed outside the block
			x=x+1;
			int z=3;
			System.out.println("inside inner block : "+x);
			System.out.println("inside the block z is : "+(z+1));
		}
		int y=6;
		System.out.println("outside the block : "+x);
		
	}

}
