package CaseStudy;

public class StudentRegistrationApp {
    public static void main(String[] args) {
        // Students
        System.out.println("===== Student Details =====");
        System.out.printf("%-10s %-10s %-5s%n", "Name", "RollNum", "Grade");
        Student s1 = new Student(1, "Paddu", 'A');
        Student s2 = new Student(2, "Reddy", 'C');
        Student s3 = new Student(3, "Bhanu", 'A');
        s1.display();
        s2.display();
        s3.display();

        // Registration
        System.out.println("\n===== Registration Form =====");
        System.out.printf("%-10s %-10s %-5s%n", "Name", "Age", "Gender");
        RegistrationForm r1 = new RegistrationForm("Rao", 55, 'M');
        r1.display();
    }
}
