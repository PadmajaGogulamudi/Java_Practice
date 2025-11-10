package com.practice;
class O2 {
    void f(int... x) { System.out.println("varargs"); }
    void f(Integer x) { System.out.println("Integer"); }
}
public class P6 {
    public static void main(String[] args) {
        O2 o = new O2();
        o.f();      // chooses varargs
        o.f(5);     // chooses Integer (boxing) over varargs? actually boxing then exact; here "Integer"
    }
}
