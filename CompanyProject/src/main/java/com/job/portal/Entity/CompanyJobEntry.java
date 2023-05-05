package com.job.portal.Entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="company_job_entry")
public class CompanyJobEntry {
//	@SuppressWarnings("deprecation")
 
//	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer jobId;
	private String jobRole;
	private String jobDescription;
	@CreationTimestamp
	private Date updatedDate;							
	@UpdateTimestamp
	private Date createdDate;
//	@MapsId
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="companyId",referencedColumnName = "companyId")
	private CompanyDetails companyId;
	
	public CompanyJobEntry() {
		super();
	}
	
	public CompanyJobEntry(Integer jobId) {
		super();
		this.jobId = jobId;
	}

	public CompanyJobEntry(Integer jobId, CompanyDetails companyId) {
		super();
		this.jobId = jobId;
		this.companyId = companyId;
	}

	public CompanyJobEntry(String jobRole, String jobDescription, CompanyDetails companyId) {
		super();
		this.jobRole = jobRole;
		this.jobDescription = jobDescription;
		this.companyId = companyId;
	}

	public CompanyJobEntry(Integer jobId, String jobRole, String jobDescription, CompanyDetails companyId) {
		super();
		this.jobId = jobId;
		this.jobRole = jobRole;
		this.jobDescription = jobDescription;
		this.companyId = companyId;
	}

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
