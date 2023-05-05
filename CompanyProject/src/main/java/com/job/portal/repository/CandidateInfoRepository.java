package com.job.portal.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.portal.Entity.CandidateInfo;
import com.job.portal.Entity.CompanyDetails;

public interface CandidateInfoRepository extends JpaRepository<CandidateInfo, Integer>{

	ArrayList<CandidateInfo> findAllByCompanyId(CompanyDetails companyId);

}
