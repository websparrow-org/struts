package org.websparrow.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JsonRestDao {

	public static Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/websparrow", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static ResultSet fetchData(String name) {
		ResultSet rs = null;
		try {

			PreparedStatement ps = connect().prepareStatement("SELECT * FROM emp_details where ename=?");
			ps.setString(1, name);
			rs = ps.executeQuery();

			return rs;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
