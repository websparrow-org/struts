package org.websparrow;

import com.opensymphony.xwork2.ActionSupport;

public class IfElseAction extends ActionSupport {
	private String msg = "";

	@Override
	public String execute() throws Exception {
		return "SUCCESS";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
