package com.job.portal.Response;

import org.springframework.http.HttpStatus;

public class JsonResponse {
	String message;
	int httpstatus;
	Object responseObject;
	
	
	public JsonResponse(String message, int httpstatus, Object responseObject) {
		super();
		this.message = message;
		this.httpstatus = httpstatus;
		this.responseObject = responseObject;
	}	
	
	public JsonResponse(int httpstatus, Object responseObject) {
		super();
		this.httpstatus = httpstatus;
		this.responseObject = responseObject;
	}

	public JsonResponse() {
		super();
	}
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getHttpstatus() {
		return httpstatus;
	}
	public void setHttpstatus(int httpstatus) {
		this.httpstatus = httpstatus;
	}
	public Object getResponseObject() {
		return responseObject;
	}
	public void setResponseObject(Object responseObject) {
		this.responseObject = responseObject;
	}
	
	
	@Override
	public String toString() {
		return "JsonResponse [message=" + message + ", httpstatus=" + httpstatus + ", responseObject=" + responseObject
				+ "]";
	}
	
	
}
