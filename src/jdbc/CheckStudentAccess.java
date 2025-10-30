package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class CheckStudentAccess {
	static Scanner sc;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		StudentAccess sa = new StudentAccess();
		while (true) {
			System.out.println("1.insert\n2.update\n3.delete\n4.select all\n5.select by id\n6.delete All");
			System.out.println("select operation or to exit enter [y]:");
			sc = new Scanner(System.in);
			int n = 0;
			try {
				n = sc.nextInt();
			} catch (Exception e) {
				System.out.println("exiting!!!");

				break;
			}

			switch (n) {
			case 1 -> {
				sa.insertStu();
			}
			case 2 -> {
				sa.updateStu();
			}
			case 3 -> {
				sa.deleteStu();
			}
			case 4 -> {
				System.out.println("ID | Name | marks");
				sa.selectAll();
			}
			case 5 -> {
				sa.selectById();
			}
			case 6 -> {
				sa.deleteAll();
			}
			default -> {
				System.out.println("invalid selection");

			}
			}
		}
		sc.close();

	}

}
