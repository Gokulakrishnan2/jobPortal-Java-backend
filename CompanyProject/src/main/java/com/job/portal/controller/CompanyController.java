package com.job.portal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.job.portal.Dto.CandidateInfoDTO;
import com.job.portal.Dto.CompanyDetailsDTO;
import com.job.portal.Dto.CompanyJobEntryDTO;
import com.job.portal.Dto.CompanyProfileDTO;
import com.job.portal.Dto.LoginDTO;
import com.job.portal.Dto.ShowDetailsDTO;
import com.job.portal.Entity.CompanyDetails;
import com.job.portal.service.CompanyService;
import com.job.portal.Response.JsonResponse;
import com.job.portal.repository.CompanyDetailsRepository;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	@Autowired
	private CompanyDetailsRepository companyDetailsRepository;
	
	@PostMapping("/")
	public JsonResponse postCompanyDetails(@RequestBody CompanyDetailsDTO companyDetailsDTO) {
 System.out.println("String"+companyDetailsDTO);
		if((companyDetailsRepository.findByCompanyEmail(companyDetailsDTO.getCompanyEmail()))!=
		 null ) throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Email already exists");
		
		
		  companyService.addCompanyDetails(companyDetailsDTO);
		  String name = companyDetailsDTO.getCompanyName();
		return new JsonResponse("company registered sucessfully",HttpStatus.OK.value(),name);
	}
	
	@PostMapping("/login")
	public JsonResponse login(@RequestBody LoginDTO loginDTO){
		System.out.println(loginDTO);
		JsonResponse jsonResponse = companyService.loginEmployee(loginDTO);
		System.out.println(jsonResponse);
		return jsonResponse;
	}
	
	@PostMapping("/job_entry")
	public JsonResponse postjob(@RequestBody CompanyJobEntryDTO companyJobEntryDTO) {
		 System.out.println("String"+companyJobEntryDTO);

		companyService.addJobDetails(companyJobEntryDTO);
		
		return new JsonResponse("job posted successfully",HttpStatus.OK.value(),companyJobEntryDTO.getJobRole());
	}
	
	@GetMapping("/job_search")
	public JsonResponse jobSearch() {
		
		List<ShowDetailsDTO> jobdetails = companyService.getJobDetails();
		System.out.println(jobdetails);
		return new JsonResponse ("searched details are :",HttpStatus.OK.value(),jobdetails);
	}
	
	@PostMapping("/candidate_apply")
	public JsonResponse candidateApply(@RequestBody CandidateInfoDTO candidateInfoDTO) {
		System.out.println(candidateInfoDTO);
		companyService.addCandidateInfo(candidateInfoDTO);		
		return new JsonResponse("candidate details saved successfully",HttpStatus.OK.value(),candidateInfoDTO.getCandidateName());
	}
	
	@GetMapping("/company_profile/{id}")
	public JsonResponse CompanyProfileDate(@PathVariable(value="id") CompanyDetails id) {

		ArrayList<CompanyProfileDTO> result = companyService.getProfileData(id);
		return new JsonResponse("company profile details are :",HttpStatus.OK.value(),result);
	}
	
}
