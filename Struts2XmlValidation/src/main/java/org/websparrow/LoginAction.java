package org.websparrow;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -4699529185023717636L;
	private String user, pass;

	public LoginAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() throws Exception {
		return "SUCCESS";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
