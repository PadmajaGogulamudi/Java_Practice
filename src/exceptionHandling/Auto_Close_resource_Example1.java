package exceptionHandling;

public class Auto_Close_resource_Example1 {

	public static void main(String[] args) {
		try (AutoCloseable ac = () -> {throw new Exception("Close failed");}) 
		{
			throw new Exception("Main failed");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t);
			}
		}

	}

}
