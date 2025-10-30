package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class TestDBConnection {
	public static void main(String[] args) {
		// Database connection details
		String url = "jdbc:mysql://localhost:3306/sampleone";
		String user = "root"; // your MySQL username
		String password = "oracle"; // your MySQL password

		try {
			// Load MySQL JDBC driver (optional for JDBC 4+)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Try to connect
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected successfully!");

			// preparing the statement
			Statement stmt = con.createStatement();
			// preparing the resultSet
			
			ResultSet rs = stmt.executeQuery("select * from emp");
			System.out.println("ID | Name | comm");
			while (rs.next()) {
				System.out.println(rs.getInt("empno") + " | " + rs.getString("ename") + " | " + rs.getInt("comm"));
			}

			// Close connection
			con.close();
			System.out.println(" Connection closed.");

		} catch (Exception e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}
	}
}
