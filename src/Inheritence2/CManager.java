package Inheritence2;

import Inheritence1.CEmployee;

public class CManager extends CEmployee {
    private String dept;

    // Constructor chaining
    public CManager(String name, int id, double salary, String dept) {
        super(name, id, salary);
        this.dept = dept;
        System.out.println("Manager constructor called!");
    }

    // Getter and Setter
    public String getDept() { return dept; }
    public void setDept(String dept) { 
    	this.dept = dept; }

    // Overridden display
    @Override
    public void display() {
        super.display();
        System.out.println("Department : " + dept);
    }
}
