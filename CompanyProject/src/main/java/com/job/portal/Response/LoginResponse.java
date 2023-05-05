package com.job.portal.Response;

import org.springframework.http.HttpStatus;

public class LoginResponse {
	String message;
	HttpStatus httpstatus;
	
	
	public LoginResponse(String message, HttpStatus httpstatus) {
		super();
		this.message = message;
		this.httpstatus = httpstatus;
	}
	
	public LoginResponse() {
		super();
	}


	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getHttpstatus() {
		return httpstatus;
	}
	public void setHttpstatus(HttpStatus httpstatus) {
		this.httpstatus = httpstatus;
	}

	@Override
	public String toString() {
		return "LoginResponse [message=" + message + ", httpstatus=" + httpstatus + "]";
	}
}
