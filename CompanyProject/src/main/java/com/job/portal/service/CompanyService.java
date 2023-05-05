package com.job.portal.service;

import java.util.ArrayList;
import java.util.List;

import com.job.portal.Dto.CandidateInfoDTO;
import com.job.portal.Dto.CompanyDetailsDTO;
import com.job.portal.Dto.CompanyJobEntryDTO;
import com.job.portal.Dto.CompanyProfileDTO;
import com.job.portal.Dto.LoginDTO;
import com.job.portal.Dto.ShowDetailsDTO;
import com.job.portal.Entity.CompanyDetails;
import com.job.portal.Response.JsonResponse;

public interface CompanyService {

	 String addCompanyDetails(CompanyDetailsDTO companyDetailsDTO);

	JsonResponse loginEmployee(LoginDTO loginDTO);

	String addJobDetails(CompanyJobEntryDTO companyJobEntryDTO);

	String addCandidateInfo(CandidateInfoDTO candidateInfoDTO);

	List<ShowDetailsDTO> getJobDetails();

	ArrayList<CompanyProfileDTO> getProfileData(CompanyDetails id);

	

}
