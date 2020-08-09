package com.sidhant.service;

import java.util.List;

import com.sidhant.model.SsnEnrollmentRequest;


public interface SsaService {
    public List<String> getAllStateNames();   
	
    public Long ssnEnrollment(SsnEnrollmentRequest req);
    
    public String checkEnrollment(Long ssn, String stateName);
	

}