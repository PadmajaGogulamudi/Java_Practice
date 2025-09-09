package exceptionHandling;
import java.util.Scanner;

class InvalidAgeException extends Exception{

	public InvalidAgeException(String string) {
		super(string);
	}
	
}

public class AgeHandling {

	public static void main(String[] args)throws  InvalidAgeException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age to vote : ");
		try {
			int age=sc.nextInt();
			if(age<18)
				throw new InvalidAgeException("age must be above 18 to vote");
			System.out.println("allow to vote");
	
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("task completed!!");
		}finally {
				System.out.println("finalllll");
			}
System.out.println("after exception ");
	}

}
