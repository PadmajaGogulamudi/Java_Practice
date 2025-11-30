package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Student s1 = new Student(0, "paddu", 'A');
		Student s2 = new Student(2, "reddy", 'C');
		Student s3 = new Student(1, "subbu", 'A');
		studentList.add(s1);
		studentList.add(s2);

		studentList.add(s3);

		for (Student s : studentList) {
			System.out.println(s);
		}
		System.out.println("*******************");
		Collections.sort(studentList);
		for (Student s : studentList) {
			System.out.println(s);
		}

	}

}
