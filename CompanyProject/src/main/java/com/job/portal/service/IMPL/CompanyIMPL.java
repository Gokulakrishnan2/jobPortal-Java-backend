package com.job.portal.service.IMPL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.job.portal.Dto.CandidateInfoDTO;
import com.job.portal.Dto.CompanyDetailsDTO;
import com.job.portal.Dto.CompanyJobEntryDTO;
import com.job.portal.Dto.CompanyProfileDTO;
import com.job.portal.Dto.LoginDTO;
import com.job.portal.Dto.ShowDetailsDTO;
import com.job.portal.Entity.CandidateInfo;
import com.job.portal.Entity.CompanyDetails;
import com.job.portal.Entity.CompanyJobEntry;
import com.job.portal.Response.JsonResponse;
import com.job.portal.repository.CandidateInfoRepository;
import com.job.portal.repository.CompanyDetailsRepository;
import com.job.portal.repository.CompanyJobEntryRepository;
import com.job.portal.service.CompanyService;

@Service
public class CompanyIMPL implements CompanyService {

	@Autowired
	private CompanyDetailsRepository companyDetailsRepository;

	@Autowired
	private CompanyJobEntryRepository companyJobEntryRepository;

	@Autowired
	private CandidateInfoRepository candidateInfoRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private EmailSenderService emailSenderService;
	

	public CompanyIMPL(CompanyDetailsRepository companyDetailsRepository,
			CompanyJobEntryRepository companyJobEntryRepository, CandidateInfoRepository candidateInfoRepository,
			PasswordEncoder passwordEncoder, EmailSenderService emailSenderService) {
		super();
		this.companyDetailsRepository = companyDetailsRepository;
		this.companyJobEntryRepository = companyJobEntryRepository;
		this.candidateInfoRepository = candidateInfoRepository;
		this.passwordEncoder = passwordEncoder;
		this.emailSenderService = emailSenderService;
	}

	@Override
	public String addCompanyDetails(CompanyDetailsDTO companyDetailsDTO) {
		 
		CompanyDetails companyDetails = new CompanyDetails(companyDetailsDTO.getCompanyName(),
				companyDetailsDTO.getCompanyEmail(), companyDetailsDTO.getCompanyPhone(),
				companyDetailsDTO.getCompanyAddress(), companyDetailsDTO.getCompanyCity(),
				companyDetailsDTO.getCompanyType(),
				this.passwordEncoder.encode(companyDetailsDTO.getCompanyPassword()));

		companyDetailsRepository.save(companyDetails);
		return null;
	}

	@Override
	public JsonResponse loginEmployee(LoginDTO loginDTO) {
		CompanyDetails company1 = companyDetailsRepository.findByCompanyEmail(loginDTO.getCompanyEmail());
		System.out.println(company1.getCompanyEmail()+" "+ company1.getCompanyPassword());
		
		//if(company1.getCompanyEmail()! = null) throw HttpClientErrorException(HttpStatus.BAD_REQUEST.value(),"email not exist");
		
		
		if (company1.getCompanyEmail() != null) {
			String password = loginDTO.getCompanyPassword();
			System.out.println(loginDTO.getCompanyPassword());
			String encodedpassword = company1.getCompanyPassword();
			Boolean isPasswordRight = passwordEncoder.matches(password, encodedpassword);
			System.out.println(isPasswordRight);
			if (Boolean.TRUE.equals(isPasswordRight)) {
				Optional<CompanyDetails> employee = companyDetailsRepository.findOneByCompanyEmailAndCompanyPassword(loginDTO.getCompanyEmail(), encodedpassword);
				if (employee.isPresent()) {
					System.out.println("Login success");
					 HashMap<String, CompanyDetails > response = new HashMap<>();
					 response.put("data", company1);
					return new JsonResponse( HttpStatus.OK.value(),response);
				} else {
					System.out.println("Login failed");

					return new JsonResponse( HttpStatus.BAD_REQUEST.value(),loginDTO.getCompanyEmail());
				}
			} else {
				System.out.println("password not match");
				//return new JsonResponse( HttpStatus.BAD_REQUEST.value(),"password not match");

				 throw new HttpClientErrorException( HttpStatus.BAD_REQUEST,"Invalid credential");
			}
		} else {
			System.out.println("Email not exists");
			//return new JsonResponse( HttpStatus.BAD_REQUEST.value(),"Email not exists");
			 throw new HttpClientErrorException( HttpStatus.BAD_REQUEST,"email not exists");
		}
	}

	@Override
	public String addJobDetails(CompanyJobEntryDTO companyJobEntryDTO) {
		
		CompanyJobEntry companyJobEntry = new CompanyJobEntry(companyJobEntryDTO.getJobRole(),
				companyJobEntryDTO.getJobDescription(), companyJobEntryDTO.getCompanyId());

		companyJobEntryRepository.save(companyJobEntry);

		return null;
	}

	@Override
	public List<ShowDetailsDTO> getJobDetails() {

		ArrayList<CompanyJobEntry> jobEntry = (ArrayList<CompanyJobEntry>) companyJobEntryRepository.findAll();
		ArrayList<CompanyDetails> companyEntry = (ArrayList<CompanyDetails>) companyDetailsRepository.findAll();
		List<ShowDetailsDTO> jobEntryList = new ArrayList<>();
		for (int a = 0, b = 0; a < jobEntry.size() && b < companyEntry.size(); a++, b++) {

			ShowDetailsDTO showDetailsDTO = new ShowDetailsDTO(jobEntry.get(a).getjobId(),
					 jobEntry.get(a).getJobRole(),jobEntry.get(a).getJobDescription(),
					companyEntry.get(b).getcompanyId(), companyEntry.get(b).getCompanyName(),
					companyEntry.get(b).getCompanyEmail(), companyEntry.get(b).getCompanyPhone(),
					companyEntry.get(b).getCompanyAddress(), companyEntry.get(b).getCompanyCity(),
					companyEntry.get(b).getCompanyType());

			jobEntryList.add(showDetailsDTO);
		}
		return jobEntryList;
	}
	
	@Override
	public String addCandidateInfo(CandidateInfoDTO candidateInfoDTO) {
		CandidateInfo candidateInfo = new CandidateInfo(candidateInfoDTO.getCandidateName(),
				candidateInfoDTO.getCandidateEmail(), candidateInfoDTO.getCandidatePhone(),
				candidateInfoDTO.getHighestQualification(), candidateInfoDTO.getDegree(),
				candidateInfoDTO.getCommunicationAddress(), candidateInfoDTO.getCurrentCity(),
				candidateInfoDTO.getCompanyId(),candidateInfoDTO.getJobId()
				);
		CompanyJobEntry companyJobEntry;
		candidateInfoRepository.save(candidateInfo);
		System.out.println(candidateInfo);
		int jRole =(candidateInfoDTO.getJobId()).getjobId();
		System.out.println(jRole);
		System.out.println((companyJobEntryRepository.findByJobId(jRole)).getJobRole());
//		CompanyJobEntry jid =
//	System.out.println((candidateInfo.getCompanyJobId()).getJobRole());			
		//CompanyJobEntry entry = companyJobEntryRepository.findByJobId(jid);
//		System.out.println(jid);
		
//		Optional<CompanyJobEntry> role= companyJobEntryRepository.findById(jid);
//		String jRole = r
		emailSenderService.sendEmail("sender@gmail.com",
				"----------------candidate details ------------\n"+
		"job applied for "+(companyJobEntryRepository.findByJobId(jRole)).getJobRole() +
		"\n candidate name : "+candidateInfo.getCandidateName()+
		"\n candidate email : "+candidateInfo.getCandidateEmail()+
		"\n candidate phone : "+candidateInfo.getCandidatePhone()+
		"\n HighestQualification : "+candidateInfo.getHighestQualification()+
		"\n Degree : "+candidateInfo.getDegree()+
		"\n CommunicationAdderess : "+candidateInfo.getCommunicationAddress()+
		"\n CurrentCity : "+candidateInfo.getCurrentCity()+"\n\n Thank you",
				"New candidate applied for Job Now!!!");
		
		return null;
		
	}

	@Override
	public ArrayList<CompanyProfileDTO> getProfileData(CompanyDetails id) {
		
		ArrayList<CompanyJobEntry> jobEntry = companyJobEntryRepository.findAllByCompanyId(id);
		ArrayList<CandidateInfo> companyEntry = candidateInfoRepository.findAllByCompanyId(id);
		ArrayList<CompanyProfileDTO> companyProfileList = new ArrayList<>();
		for(int a=0,b=0; a < jobEntry.size() && b< companyEntry.size(); a++,b++ ) {
			CompanyProfileDTO companyProfileDTO = new CompanyProfileDTO(
					jobEntry.get(a).getjobId(),
					jobEntry.get(a).getJobRole(),
					jobEntry.get(a).getJobDescription(),
					companyEntry.get(b).getCandidateName(),
					companyEntry.get(b).getCandidateEmail(),
					companyEntry.get(b).getCandidatePhone(),
					companyEntry.get(b).getHighestQualification(),
					companyEntry.get(b).getDegree(),
					companyEntry.get(b).getCommunicationAddress(),
					companyEntry.get(b).getCurrentCity()					
					);
			
			companyProfileList.add(companyProfileDTO);
			
		}
	
		return  companyProfileList;
	}
	
}
