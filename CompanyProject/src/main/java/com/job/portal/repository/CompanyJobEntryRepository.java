package com.job.portal.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.job.portal.Entity.CompanyDetails;
import com.job.portal.Entity.CompanyJobEntry;

public interface CompanyJobEntryRepository extends JpaRepository<CompanyJobEntry, Integer>{
	
	ArrayList<CompanyJobEntry> findAllByCompanyId(CompanyDetails companyId);
	
	CompanyJobEntry findByJobId(int jobId);
}
