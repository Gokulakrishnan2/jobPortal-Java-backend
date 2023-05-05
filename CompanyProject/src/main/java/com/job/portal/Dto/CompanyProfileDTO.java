package com.job.portal.Dto;

public class CompanyProfileDTO {

	private Integer jobId;
	private String jobRole;
	private String jobDescription;
	private String candidateName;
	private String candidateEmail;
	private Long candidatePhone;
	private String highestQualification;
	private String degree;
	private String communicationAdderess;
	private String currentCity;
	
	public CompanyProfileDTO() {
		super();
	}
	
	public CompanyProfileDTO(Integer jobId, String jobRole, String jobDescription, String candidateName,
			String candidateEmail, Long candidatePhone, String highestQualification, String degree,
			String communicationAdderess, String currentCity) {
		super();
		this.jobId = jobId;
		this.jobRole = jobRole;
		this.jobDescription = jobDescription;
		this.candidateName = candidateName;
		this.candidateEmail = candidateEmail;
		this.candidatePhone = candidatePhone;
		this.highestQualification = highestQualification;
		this.degree = degree;
		this.communicationAdderess = communicationAdderess;
		this.currentCity = currentCity;
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

	public String getCommunicationAdderess() {
		return communicationAdderess;
	}

	public void setCommunicationAdderess(String communicationAdderess) {
		this.communicationAdderess = communicationAdderess;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	@Override
	public String toString() {
		return "CompanyProfileDTO [jobId=" + jobId + ", jobRole=" + jobRole + ", jobDescription=" + jobDescription
				+ ", candidateName=" + candidateName + ", candidateEmail=" + candidateEmail + ", candidatePhone="
				+ candidatePhone + ", highestQualification=" + highestQualification + ", degree=" + degree
				+ ", communicationAdderess=" + communicationAdderess + ", currentCity=" + currentCity + "]";
	}
	
	
}
