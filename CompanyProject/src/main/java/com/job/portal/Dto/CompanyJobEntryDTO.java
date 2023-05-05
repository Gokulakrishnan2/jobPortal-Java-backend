package com.job.portal.Dto;

import java.sql.Date;

import com.job.portal.Entity.CompanyDetails;


public class CompanyJobEntryDTO {
	private Integer jobId;
	private String jobRole;
	private String jobDescription;
	private Date updatedDate;							
	private Date createdDate;
	private CompanyDetails companyId;
	
	public CompanyJobEntryDTO() {
		super();
	}
	
	
	
	public CompanyJobEntryDTO(String jobRole, String jobDescription, CompanyDetails companyId) {
		super();
		this.jobRole = jobRole;
		this.jobDescription = jobDescription;
		this.companyId = companyId;
	}



//	public CompanyJobEntryDTO(Integer jobId, String jobRole, String jobDescription, CompanyDetails companyId) {
//		super();
//		this.jobId = jobId;
//		this.jobRole = jobRole;
//		this.jobDescription = jobDescription;
//		this.companyId = companyId;
//	}

//	public CompanyJobEntryDTO(Integer jobId, String jobRole, String jobDescription) {
//		super();
//		this.jobId = jobId;
//		this.jobRole = jobRole;
//		this.jobDescription = jobDescription;
//	}

//	public CompanyJobEntryDTO(Integer jobId, String jobRole, String jobDescription, CompanyDetailsDTO companyId, Date updatedDate,
//			Date createdDate) {
//		super();
//		this.jobId = jobId;
//		this.jobRole = jobRole;
//		this.jobDescription = jobDescription;
//		this.companyId = companyId;
//		this.updatedDate = updatedDate;
//		this.createdDate = createdDate;
//	}
//
//	public CompanyJobEntryDTO(String jobRole, String jobDescription, CompanyDetailsDTO companyId, Date updatedDate,
//			Date createdDate) {
//		super();
//		this.jobRole = jobRole;
//		this.jobDescription = jobDescription;
//		this.companyId = companyId;
//		this.updatedDate = updatedDate;
//		this.createdDate = createdDate;
//	}

	



	public Integer getjobId() {
		return jobId;
	}

	public void setjobId(Integer jobId) {
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

	public CompanyDetails getCompanyId() {
		return companyId;
	}

	public void setCompanyId(CompanyDetails companyId) {
		this.companyId = companyId;
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
		return "CompanyJobEntry [jobId=" + jobId + ", jobRole=" + jobRole + ", jobDescription=" + jobDescription
				+ ", companyId=" + companyId + ", updatedDate=" + updatedDate + ", createdDate=" + createdDate + "]";
	}
	
	
	
}

