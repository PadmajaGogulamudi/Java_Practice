package CaseStudy;

public class RegistrationForm {
    String name;
    int age;
    char gender;

    public RegistrationForm(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void display() {
        System.out.printf("%-10s %-10d %-5c%n", name, age, gender);
    }
}
