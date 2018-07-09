package org.websparrow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SubReportDao {

	public static ResultSet employeeDetails() {
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/websparrow", "root", "");
			PreparedStatement ps = con.prepareStatement("SELECT ename,designation,dept,salary,location FROM emp_details");
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
}
