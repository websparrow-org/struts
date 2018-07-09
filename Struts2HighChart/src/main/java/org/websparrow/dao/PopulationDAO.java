package org.websparrow.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PopulationDAO {
	
	public static Connection connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/websparrow", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static ResultSet countryPopulation() {
		ResultSet rs = null;
		try {
			
			Statement statement = connect().createStatement();
			rs = statement.executeQuery("SELECT STATE_NAME,STATE_POPULATION FROM POPULATION");

			return rs;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
