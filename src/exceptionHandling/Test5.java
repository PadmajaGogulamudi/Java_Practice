package exceptionHandling;
public class Test5 {
    static void test() {
        try {
            System.out.println("Try");
        } finally {
            throw new RuntimeException("Finally ex");
        }
    }
    public static void main(String[] args) {
        test();
    }
}
