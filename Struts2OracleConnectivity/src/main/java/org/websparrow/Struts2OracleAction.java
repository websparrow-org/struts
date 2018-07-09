package org.websparrow;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Struts2OracleAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	DataBean bean = null;
	List<DataBean> list = null;

	// testing the connection whether it is established or not
	public String checkOracleConnection() {
		Connection conn = org.websparrow.ConnectionDAO.connection();
		if (conn == null) {
			return "ERROR";
		} else {
			return "SUCCESS";
		}
	}

	// display all the data on JSP page
	public String report() throws Exception {
		ResultSet rs = org.websparrow.ConnectionDAO.report();
		list = new ArrayList<>();
		if (rs != null) {
			while (rs.next()) {
				bean = new DataBean();
				bean.setEmpNo(rs.getInt("EMPNO"));
				bean.setEmpName(rs.getString("ENAME"));
				bean.setJob(rs.getString("JOB"));
				bean.setHireDate(rs.getString("HIREDATE"));
				bean.setSal(rs.getInt("SAL"));
				list.add(bean);
			}
			return "SUCCESS";
		} else {
			return "ERROR";
		}
	}

	public List<DataBean> getList() {
		return list;
	}

	public void setList(List<DataBean> list) {
		this.list = list;
	}
}
