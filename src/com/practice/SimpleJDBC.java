package com.practice;

import java.sql.*;

public class SimpleJDBC {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); // optional in modern drivers
		try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
				PreparedStatement ps = c.prepareStatement("SELECT name FROM emp WHERE id = ?")) {
			ps.setInt(1, 1);
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next())
					System.out.println(rs.getString(1));
			}
		}
	}
}

