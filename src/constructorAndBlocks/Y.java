package constructorAndBlocks;
class X {
    {
        System.out.println("X Instance");
    }
   
    X(int y) {
        System.out.println("X Constructor"+y);
    }
//    X() {
//        System.out.println("X Constructor");
//    }
}

public class Y  extends X{
    {
        System.out.println("Y Instance");
    }
    Y() {
    	super(20);
        System.out.println("Y Constructor");
    }
    Y(int n) {
    	//this is also the one of the reason for the necessity of no arg constructor
    	//java compiler internally call's super() of it's parent class 
    	super(10);
        //this();
        System.out.println("Y Parameterized Constructor: " + n);
    }

    public static void main(String[] args) {
        new Y(10);
        new Y();
    }
}
