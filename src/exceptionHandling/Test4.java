package exceptionHandling;
class MyRes implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Close failed");
    }
}

public class Test4 {
    public static void main(String[] args) throws Exception {
        try (MyRes r = new MyRes()) {
            throw new Exception("Try failed");
        }
    }
}
