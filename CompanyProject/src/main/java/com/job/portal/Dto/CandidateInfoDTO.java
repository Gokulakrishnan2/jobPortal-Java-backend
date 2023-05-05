package com.job.portal.Dto;

import java.sql.Date;

import com.job.portal.Entity.CompanyDetails;
import com.job.portal.Entity.CompanyJobEntry;

public class CandidateInfoDTO {
	
	private Integer cid;
	private String candidateName;
	private String candidateEmail;
	private Long candidatePhone;
	private String highestQualification;
	private String degree;
	private String communicationAddress;
	private String currentCity;
	private Date createdDate;
	private Date updatedDate;
	private CompanyDetails companyId;
	private CompanyJobEntry jobId;
	
	public CandidateInfoDTO(Integer cid, String candidateName, String candidateEmail, Long candidatePhone,
			String highestQualification, String degree, String communicationAddress, String currentCity,
			Date createdDate, Date updatedDate, CompanyDetails companyId, CompanyJobEntry jobId) {
		super();
		this.cid = cid;
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.candidatePhone = candidatePhone;
		this.highestQualification = highestQualification;
		this.degree = degree;
		this.communicationAddress = communicationAddress;
		this.currentCity = currentCity;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.companyId = companyId;
		this.jobId = jobId;
	}

	public CandidateInfoDTO(String candidateName, String candidateEmail, Long candidatePhone,
			String highestQualification, String degree, String communicationAdderess, String currentCity,
			Date createdDate, Date updatedDate, CompanyDetails companyId, CompanyJobEntry jobId) {
		super();
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.candidatePhone = candidatePhone;
		this.highestQualification = highestQualification;
		this.degree = degree;
		this.communicationAddress = communicationAddress;
		this.currentCity = currentCity;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.companyId = companyId;
		this.jobId = jobId;
	}

	public CandidateInfoDTO() {
		super();
	}

	
	
	public CandidateInfoDTO(String candidateName, String candidateEmail, Long candidatePhone,
			String highestQualification, String degree, String communicationAddress, String currentCity) {
		super();
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.candidatePhone = candidatePhone;
		this.highestQualification = highestQualification;
		this.degree = degree;
		this.communicationAddress = communicationAddress;
		this.currentCity = currentCity;
	}

	public CandidateInfoDTO(String candidateName, String candidateEmail, Long candidatePhone,
			String highestQualification, String degree, String communicationAdderess, String currentCity,
			CompanyDetails companyId, CompanyJobEntry jobId) {
		super();
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.candidatePhone = candidatePhone;
		this.highestQualification = highestQualification;
		this.degree = degree;
		this.communicationAddress = communicationAddress;
		this.currentCity = currentCity;
		this.companyId = companyId;
		this.jobId = jobId;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public Long getCandidatePhone() {
		return candidatePhone;
	}

	public void setCandidatePhone(Long candidatePhone) {
		this.candidatePhone = candidatePhone;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCommunicationAddress() {
		return communicationAddress;
	}

	public void setCommunicationAdderess(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public CompanyDetails getCompanyId() {
		return companyId;
	}

	public void setCompanyId(CompanyDetails companyId) {
		this.companyId = companyId;
	}

	public CompanyJobEntry getJobId() {
		return jobId;
	}

	public void setJobId(CompanyJobEntry jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "CandidateInfoDTO [cid=" + cid + ", candidateName=" + candidateName + ", candidateEmail="
				+ candidateEmail + ", candidatePhone=" + candidatePhone + ", highestQualification="
				+ highestQualification + ", degree=" + degree + ", communicationAddress=" + communicationAddress
				+ ", currentCity=" + currentCity + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", companyId=" + companyId + ", jobId=" + jobId + "]";
	}
	
	
	
}
