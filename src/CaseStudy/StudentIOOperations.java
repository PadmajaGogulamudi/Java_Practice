package CaseStudy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentIOOperations {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\padma\\Documents\\VyshwaSir\\FileIODemoFolder\\StudentDetails.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		PrintWriter pw = new PrintWriter(f);

		while (true) {
			System.out.println(
					"1.add student\n2.display list\n3.search student\n4.update marks of stu\n5.delete stu record");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> {
				addStudent(pw);
			}
			case 2->{
				displayFile(br);
			}
			case 3->{
				System.out.print("enter student rollnum  to search : ");
				int rollnum = sc.nextInt();
				getStudent(br,rollnum);
			}
			default->{
				System.out.println("invalid selection!!");
			}
			}
			System.out.print("want to continue!![y/n]");
			if(!(sc.next().equalsIgnoreCase("y"))) {
				break;
			}
		}

	}

	static void addStudent(PrintWriter pw) {
		sc.nextLine();
		System.out.print("enter student name : ");
		String name = sc.nextLine();
		System.out.print("enter student rollnum : ");
		String rollnum = sc.next();
		sc.nextLine();
		System.out.print("enter student course : ");
		String course = sc.nextLine();
		
		System.out.print("enter student marks : ");
		int marks = sc.nextInt();
		pw.print(rollnum+"\t");
		pw.print(name+"\t");
		pw.print(course+"\t");
		pw.print(marks);
		pw.println();
		pw.flush();

		System.out.print("student " + rollnum + " added");
	}

	static void displayFile(BufferedReader br) throws IOException {
		String s = br.readLine();
		while (s != null) {
			System.out.println(s);
			s = br.readLine();

		}

	}

	static String getStudent(BufferedReader br, int rollnum) throws IOException {
		String s = br.readLine();
		while (s != null) {
			String StrRoll = "";
			for (int i = 0; i < s.length(); i++) {
				if (Character.isDigit(s.charAt(i))) {
					StrRoll += s.charAt(i);
				} else {
					break;
				}

			}
			if (Integer.parseInt(StrRoll) == rollnum) {
				return s;

			}

			s = br.readLine();

		}
		return "Student not found";

	}

}
