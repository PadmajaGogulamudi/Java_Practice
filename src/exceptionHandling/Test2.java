package exceptionHandling;

public class Test2 {
	
	static String test() {
		String s="java";
		try {
			System.exit(0);
			return s="paddu";
			
		}
		finally {
			 s="reddy";
		}
	}
	public static void main(String[] args) {
		System.out.println(test());
	}

}
