package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudOperations {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "oracle");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found exception!!");
		}
		boolean status = false;
		try {
			PreparedStatement ps = con.prepareStatement("create table stu111(ids int,name varchar(20))");
			status = ps.execute();
		} catch (Exception e) {
			System.out.println("con't create");
		}
		if (!status) {
			System.out.println("success");
		} else {
			System.out.println("fail!!");
		}

	}

}
