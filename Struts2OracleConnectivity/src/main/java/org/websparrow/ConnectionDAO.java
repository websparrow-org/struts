package org.websparrow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDAO {

	// method to create the connection
	public static Connection connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "websparrow", "system");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// method to retrieve the records from database
	public static ResultSet report() throws SQLException {
		ResultSet rs = null;
		try {
			Statement statement = connection().createStatement();
			rs = statement.executeQuery("select EMPNO,ENAME,JOB,to_char(HIREDATE,'DD-MON-YYYY') as HIREDATE,SAL from emp");
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			connection().close();
		}
	}
}
