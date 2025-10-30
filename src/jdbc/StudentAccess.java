package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentAccess {
	static Connection con;
	static Scanner sc = new Scanner(System.in);
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			System.out.println("ClassNotFoundException");
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "oracle");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertStu() throws SQLException {
		System.out.println("enter id:");
		int stu_id = sc.nextInt();
		sc.nextLine();

		System.out.println("enter name:");
		String sname = sc.nextLine();

		System.out.println("enter marks:");
		int smar = sc.nextInt();

		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, stu_id);
		ps.setString(2, sname);
		ps.setInt(3, smar);
		// execute---plsql,executeupdate--(insert,update,delete),executeQuery--select
		int n = ps.executeUpdate();
		if (n > 0) {
			System.out.println(n + " rows effected.");
		} else
			System.out.println("something went wrong!!");

	}

	public void updateStu() throws SQLException {
		System.out.println("enter id:");

		int stu_id = sc.nextInt();
		Student student = FindbyId(stu_id);
		if (student.getId() != 0) {
			System.out.println("Student details :\nid : " + student.getId() + "\nname : " + student.getName()
					+ "\nmarks : " + student.getMarks() + "\n enter updated details : ");

			sc.nextLine();
			System.out.println("enter name:");
			String sname = sc.nextLine();
			
			System.out.println("enter marks:");
			int smar = sc.nextInt();
			PreparedStatement ps = con.prepareStatement("update student set name=?,marks=? where id= ?");
			ps.setString(1, sname);
			ps.setInt(2, smar);
			ps.setLong(3, student.getId());
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + " rows effected.");
			} else
				System.out.println("something went wrong!!");

		}

		else {
			System.out.println("your entered id is not available : " + stu_id);
		}
	}

	public void deleteStu() throws SQLException {
		System.out.println("enter id:");

		int stu_id = sc.nextInt();

		PreparedStatement ps = con.prepareStatement("delete from student  where id=?");
		ps.setInt(1, stu_id);
		int n = ps.executeUpdate();
		if (n > 0) {
			System.out.println(n + " rows deleted.");
		} else
			System.out.println("something went wrong!!");

	}

	public void selectAll() throws SQLException {
		PreparedStatement ps = con.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("marks"));

		}

	}

	public void selectById() throws SQLException {
		System.out.println("enter id:");

		int stu_id = sc.nextInt();
		PreparedStatement ps = con.prepareStatement("select * from student w");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			if (stu_id == rs.getInt("id"))
				System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getInt("marks"));

		}

	}

	public void deleteAll() throws SQLException {
		PreparedStatement ps = con.prepareStatement("delete from student");
		int n = ps.executeUpdate();
		if (n > 0)
			System.out.println(n + " rows deleted.");
		else
			System.out.println("something went wrong!!!");

	}

	private Student FindbyId(long id) {

		try {
			PreparedStatement ps = con.prepareStatement("select * from student where id = ?");
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				long sid = rs.getLong(1);
				String name = rs.getString(2);
				int marks = rs.getInt(3);
				return new Student(sid, name, marks);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
