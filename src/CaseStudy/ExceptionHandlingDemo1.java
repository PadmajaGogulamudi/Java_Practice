package CaseStudy;



public class ExceptionHandlingDemo1 {
	int[] studentNames = new int[3];

	public static void main(String[] args) {
		ExceptionHandlingDemo1 eh1 = new ExceptionHandlingDemo1();
		
		try {

			System.out.println(eh1.studentNames[5]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Student not found - Invalid index!!");

		}finally {
			System.out.println("operation is completed!!");
		}

	}

}
