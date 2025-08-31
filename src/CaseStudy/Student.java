package CaseStudy;

public class Student {
    int rollNo;
    String name;
    char grade;

    public Student(int rollNo, String name, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }

    void display() {
        System.out.printf("%-10s %-10d %-5c%n", name, rollNo, grade);
    }
}
