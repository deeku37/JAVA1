package com.xworkz.healthcare.repository;

import com.xworkz.healthcare.dto.HealthcareDto;

public interface HealthcareRepository {
    boolean save(HealthcareDto healthcareDto);
    HealthcareDto[] readAll();
}
