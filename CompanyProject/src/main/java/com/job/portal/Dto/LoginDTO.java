package com.job.portal.Dto;

public class LoginDTO {
	private String companyEmail;
	private String companyPassword;
	
	public LoginDTO(String companyEmail, String companyPassword) {
		super();
		this.companyEmail = companyEmail;
		this.companyPassword = companyPassword;
	}
	
	public LoginDTO() {
		super();
	}
	
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyPassword() {
		return companyPassword;
	}
	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}
	
	@Override
	public String toString() {
		return "Login [companyEmail=" + companyEmail + ", companyPassword=" + companyPassword + "]";
	}
	
	
	
}
