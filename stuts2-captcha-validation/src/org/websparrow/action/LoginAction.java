package org.websparrow.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	// Generate Getters and Setters...
	private String userId, pass, captcha, msg;

	private String sessionCaptcha = (String) ServletActionContext.getRequest().getSession()
			.getAttribute(CaptchaAction.CAPTCHA_KEY);

	@Override
	public String execute() throws Exception {

		if (sessionCaptcha.equals(captcha)) {
			if (userId.equals("admin") && pass.equals("admin")) {
				msg = "Hello, " + userId + " You have successfully logedin.";
				return SUCCESS;
			} else {
				msg = "Wrong user id or password";
				return ERROR;
			}
		} else {
			msg = "Captcha not matched.";
			return ERROR;
		}

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
