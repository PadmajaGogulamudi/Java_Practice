package exceptionHandling;

public class Test6 {
	
	static int test() {
		try {
			int a=10/0;
			return 10;}
//		}catch(Exception e) {
//			
//		}
			finally {
			//return 30;
		}
	}
	public static void main(String[] args) {
		System.out.println(test());
	}

}
