package Inheritence2;

import Inheritence1.CEmployee;

public class CTest {
    public static void main(String[] args) {
        // Employee object
        CEmployee e1 = new CEmployee("ABCD", 1, 400000);
        System.out.println("Employee Info:");
        e1.display();
        System.out.println("*************************");

        // Manager object
        CManager m1 = new CManager("XYZ", 46, 700000, "IT");
        System.out.println("Manager Info:");
        m1.display();
        System.out.println("*************************");

        // Polymorphism
        CEmployee e2 = new CManager("Bob", 301, 900000, "Finance");
        System.out.println("Polymorphism Demo (Employee reference for Manager object):");
        e2.display(); // Calls Manager’s overridden display
    }
}
