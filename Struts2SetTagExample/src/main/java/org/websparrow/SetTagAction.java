package org.websparrow;

import com.opensymphony.xwork2.ActionSupport;

public class SetTagAction extends ActionSupport {

	private static final long serialVersionUID = 6971245991310816510L;
	String country = "";

	@Override
	public String execute() throws Exception {
		return "SUCCESS";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
