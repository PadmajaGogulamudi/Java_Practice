package exceptionHandling;
public class Test3 {
    static {
    	//java.lang.ExceptionInInitializerError
        int a = 10 / 0;
    }
    public static void main(String[] args) {
        System.out.println("Main");
    }
}
