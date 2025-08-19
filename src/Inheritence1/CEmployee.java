package Inheritence1;

public class CEmployee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public CEmployee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("Employee constructor called!");
    }

    // Getters
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    // Display info
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Id   : " + id);
        System.out.println("Salary : " + salary);
    }
}
