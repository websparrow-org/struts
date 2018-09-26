package org.websparrow;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.websparrow.dao.JsonRestDao;

import com.opensymphony.xwork2.Action;

public class JsonRestAction {

	private String name, degisnation, dept, location;

	private int salary;
	ResultSet rs = null;

	public JsonRestAction() {

	}

	public String execute() throws SQLException {
		rs = JsonRestDao.fetchData(name);

		if (rs != null) {

			while (rs.next()) {
				setName(rs.getString("ename"));
				setDegisnation(rs.getString("designation"));
				setDept(rs.getString("dept"));
				setSalary(rs.getInt("salary"));
				setLocation(rs.getString("location"));
			}

		}
		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegisnation() {
		return degisnation;
	}

	public void setDegisnation(String degisnation) {
		this.degisnation = degisnation;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}