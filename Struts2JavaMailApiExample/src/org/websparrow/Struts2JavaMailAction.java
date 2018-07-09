package org.websparrow;

import com.opensymphony.xwork2.ActionSupport;

public class Struts2JavaMailAction extends ActionSupport {

	private static final long serialVersionUID = 8676674317393590961L;
	private String senderEmail, senderPassword, receiverEmail, subject, message;
	SendEmail obj = null;
	int resp = 0;

	@Override
	public String execute() throws Exception {

		obj = new SendEmail();

		resp = obj.sendMail(senderEmail, senderPassword, receiverEmail, subject, message);

		if (resp == 1) {
			return "SUCCESS";
		} else {
			return "ERROR";
		}

	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getSenderPassword() {
		return senderPassword;
	}

	public void setSenderPassword(String senderPassword) {
		this.senderPassword = senderPassword;
	}

	public String getReceiverEmail() {
		return receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
