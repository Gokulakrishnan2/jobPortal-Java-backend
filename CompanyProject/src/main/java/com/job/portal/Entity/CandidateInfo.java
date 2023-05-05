package com.job.portal.Entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="candidate_info")
public class CandidateInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	private String candidateName;
	private String candidateEmail;
	private Long candidatePhone;
	private String highestQualification;
	private String degree;
	private String communicationAddress;
	private String currentCity;
	@CreationTimestamp
	private Date createdDate;
	@UpdateTimestamp
	private Date updatedDate;
//	@MapsId
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="companyId",referencedColumnName = "companyId")
	private CompanyDetails companyId;
//	@MapsId
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="jobId", referencedColumnName = "jobId")
	private CompanyJobEntry jobId;

	
	public CandidateInfo(String candidateName, String candidateEmail, Long candidatePhone, String highestQualification,
			String degree, String communicationAddress, String currentCity, CompanyDetails companyId,
			CompanyJobEntry jobId) {
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

	public CandidateInfo() {
		super();
	}

	public CandidateInfo(Integer cid, String candidateName, String candidateEmail, Long candidatePhone,
			String highestQualification, String degree, String communicationAddress, String currentCity,
			CompanyDetails companyId, CompanyJobEntry jobId, Date updatedDate, Date createdDate) {
		super();
		this.cid = cid;
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.candidatePhone = candidatePhone;
		this.highestQualification = highestQualification;
		this.degree = degree;
		this.communicationAddress = communicationAddress;
		this.currentCity = currentCity;
		this.companyId = companyId;
		this.jobId = jobId;
		this.updatedDate = updatedDate;
		this.createdDate = createdDate;
	}

	public CandidateInfo(Integer cid) {
		super();
		this.cid = cid;
	}	

	public CandidateInfo(String candidateName, String candidateEmail, Long candidatePhone, String highestQualification,
			String degree, String communicationAddress, String currentCity) {
		super();
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.candidatePhone = candidatePhone;
		this.highestQualification = highestQualification;
		this.degree = degree;
		this.communicationAddress = communicationAddress;
		this.currentCity = currentCity;
	}

	public Integer getcId() {
		return cid;
	}

	public void setcId(Integer cid) {
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

	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public CompanyDetails getCompanyId() {
		return companyId;
	}

	public void setCompanyId(CompanyDetails companyId) {
		this.companyId = companyId;
	}

	public CompanyJobEntry getCompanyJobId() {
		return jobId;
	}

	public void setCompanyJobId(CompanyJobEntry jobId) {
		this.jobId = jobId;
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
		return "CandidateInfo [cid=" + cid + ", candidateName=" + candidateName + ", candidateEmail=" + candidateEmail
				+ ", candidatePhone=" + candidatePhone + ", highestQualification=" + highestQualification + ", degree="
				+ degree + ", communicationAddress=" + communicationAddress + ", currentCity=" + currentCity
				+ ", companyId=" + companyId + ", jobId=" + jobId + ", updatedDate=" + updatedDate
				+ ", createdDate=" + createdDate + "]";
	}
	
	
	
	
	
	
}
