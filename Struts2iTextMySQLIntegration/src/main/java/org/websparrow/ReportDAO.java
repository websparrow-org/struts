package org.websparrow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReportDAO {
	// Create the connection
	public static Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/websparrow", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// Fetch records into ResultSet
	public static ResultSet empDetails() throws SQLException {
		ResultSet rs = null;
		try {
			Statement statement = connect().createStatement();
			rs = statement.executeQuery("select * from emp_details");
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			connect().close();
		}
	}
}
