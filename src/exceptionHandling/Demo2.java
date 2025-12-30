package exceptionHandling;

class myException extends Exception {
	myException(String msg) {
		super(msg);
	}
}

public class Demo2 {

	public static void main(String[] args) {
//		try {
//			show();
//		} catch (Exception e) {
//			System.out.println("exception handled");
//		}

		show();
	}

	private static void show() {
		try {
			throw new myException("this is my own exception");
		} catch (myException e) {
			e.printStackTrace();
		} finally {
		}

	}

}
