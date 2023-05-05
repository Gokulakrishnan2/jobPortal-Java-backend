package com.job.portal.Dto;

public class ShowDetailsDTO {
	
	private Integer jobId;
	private String jobRole;
	private String jobDescription;
	private Integer companyId;
	private String companyName;
	private String companyEmail;
	private Long companyPhone;
	private String companyAddress;
	private String companyCity;
	private String companyType;
	
	public ShowDetailsDTO() {
		super();
	}
	
	public ShowDetailsDTO(Integer jobId, String jobRole, String jobDescription, Integer companyId, String companyName,
			String companyEmail, Long companyPhone, String companyAddress, String companyCity, String companyType) {
		super();
		this.jobId = jobId;
		this.jobRole = jobRole;
		this.jobDescription = jobDescription;
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		this.companyCity = companyCity;
		this.companyType = companyType;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
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

	@Override
	public String toString() {
		return "ShowDetailsDTO [jobId=" + jobId + ", jobRole=" + jobRole + ", jobDescription=" + jobDescription
				+ ", companyId=" + companyId + ", companyName=" + companyName + ", companyEmail=" + companyEmail
				+ ", companyPhone=" + companyPhone + ", companyAddress=" + companyAddress + ", companyCity="
				+ companyCity + ", companyType=" + companyType + "]";
	}
	
	
	
}
