package com.job.portal.Dto;

import java.sql.Date;

public class CompanyDetailsDTO {
	private Integer companyId;
	private String companyName;
	private String companyEmail;
	private Long companyPhone;
	private String companyAddress;
	private String companyCity;
	private String companyType;
	private String companyPassword;
	private Date updatedDate;
	private Date createdDate;
	
	public CompanyDetailsDTO() {
		super();
	}

	public CompanyDetailsDTO(Integer companyId) {
		super();
		this.companyId = companyId;
	}

	public CompanyDetailsDTO(Integer companyId, String companyName, String companyEmail, Long companyPhone, String companyAddress,
			String companyCity, String companyType, String companyPassword, Date updatedDate, Date createdDate) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		this.companyCity = companyCity;
		this.companyType = companyType;
		this.companyPassword = companyPassword;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
	}
	
	public CompanyDetailsDTO(String companyName, String companyEmail, Long companyPhone, String companyAddress,
			String companyCity, String companyType, String companyPassword, Date updatedDate, Date createdDate) {
		super();
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		this.companyCity = companyCity;
		this.companyType = companyType;
		this.companyPassword = companyPassword;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
	}
	
	
	public CompanyDetailsDTO(Integer companyId, String companyName, String companyEmail, Long companyPhone,
			String companyAddress, String companyCity, String companyType, String companyPassword) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		this.companyCity = companyCity;
		this.companyType = companyType;
		this.companyPassword = companyPassword;
	}


	public Integer getcompanyId() {
		return companyId;
	}

	public void setcompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public Long getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(Long companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCompanyPassword() {
		return companyPassword;
	}

	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyEmail=" + companyEmail
				+ ", companyPhone=" + companyPhone + ", companyAddress=" + companyAddress + ", companyCity="
				+ companyCity + ", companyType=" + companyType + ", companyPassword=" + companyPassword
				+ ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + "]";
	}
}
