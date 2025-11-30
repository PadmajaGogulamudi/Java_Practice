package collections;

public class Student  implements Comparable<Student>{
	int id;
	String name;
	char grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Student(int id, String name, char grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	@Override
	public int compareTo(Student other) {
		return this.id - other.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	

}
