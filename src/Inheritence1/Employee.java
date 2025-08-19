package Inheritence1;

public class Employee {
private  String name;
private   int id;
private  double salary;

public void setName(String name ) {
	this.name=name;
}
public  String getName() {
	return name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public void display() {
	
	System.out.println("name : "+name);
	System.out.println("Id : "+id);
	System.out.println("salary : "+salary);
	

}
}


