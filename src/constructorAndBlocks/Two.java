package constructorAndBlocks;

class One {
    static {
        System.out.println("One Static");
    }
    {
        System.out.println("One Instance");
    }
    One() {
        System.out.println("One Constructor");
    }
}
public class Two extends One {
    static {
        System.out.println("Two Static");
    }
    {
        System.out.println("Two Instance");
    }
    Two() {
        System.out.println("Two Constructor");
    }
    public static void main(String[] args) {
        new Two();
    }
}
