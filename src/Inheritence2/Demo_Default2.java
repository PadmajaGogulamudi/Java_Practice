package Inheritence2;

import Inheritence1.Demo_Default1;

public class Demo_Default2 {

	public static void main(String[] args) {
		// Demo_Default1 d1 = new Demo_Default1(); constructor is default so outside of
		// the package we can't create object
		// d1.show();
		// System.out.println(d1.name); eventhough we are importing the package we can't
		// access default data members at outside of the package
		String s1 = "Java";
		String s2 = new String("Java").intern();
		System.out.println(s1 == s2);

	}

}
