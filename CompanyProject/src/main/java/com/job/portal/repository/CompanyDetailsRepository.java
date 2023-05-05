package com.job.portal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.job.portal.Entity.CompanyDetails;

@EnableJpaRepositories
@Repository
public interface CompanyDetailsRepository extends JpaRepository<CompanyDetails, Integer>{

	CompanyDetails findByCompanyEmail(String companyEmail);
	
	CompanyDetails findByCompanyName(String companyName);
	
	Optional<CompanyDetails> findOneByCompanyEmailAndCompanyPassword(String companyEmail, String companyPassword);
	
}
