package constructorAndBlocks;/*
Blocks can also exist inside methods, mainly for scope limitation.
scope management & avoiding variable name conflicts.*/

public class LocalBlockDemo {
    public static void main(String[] args) {
        {
            int x = 10;
            System.out.println("Inside Local Block: " + x);
        }
        // System.out.println(x); // ❌ Error: x not visible here
    }
}

