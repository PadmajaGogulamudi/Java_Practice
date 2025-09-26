package exceptionHandling;

class myException extends RuntimeException {
	myException(String msg){
		super(msg);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			show();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

	}

	private static void show() {
		
			throw new myException("this is my own exception");
		
		
	}

}
