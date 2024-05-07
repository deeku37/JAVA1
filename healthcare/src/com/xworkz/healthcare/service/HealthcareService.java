package com.xworkz.healthcare.service;

import com.xworkz.healthcare.dto.HealthcareDto;

public interface HealthcareService {
    boolean validateAndSave(HealthcareDto healthcareDto);
    void readAll();
    boolean isPresent(HealthcareDto healthcareDto);
    HealthcareDto searchByName(String healthcareName);
}
