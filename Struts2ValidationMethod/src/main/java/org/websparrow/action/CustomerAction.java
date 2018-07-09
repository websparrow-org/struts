package org.websparrow.action;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	private static final long serialVersionUID = -7005487231574582188L;
	// Generate getters and setters...
	private String firstName;
	private String lastName;
	private String msg;

	@Override
	public void validate() {
		if (firstName.trim().equals("")) {
			addFieldError("firstName", "First name can't be blank.");
		}
		if (lastName.trim().equals("")) {
			addFieldError("lastName", "Last name can't be blank.");
		}
	}

	@Override
	public String execute() throws Exception {
		msg = firstName + " " + lastName + " added successfully.";
		return "SUCCESS";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
