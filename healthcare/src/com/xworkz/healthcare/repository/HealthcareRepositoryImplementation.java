package com.xworkz.healthcare.repository;

import com.xworkz.healthcare.dto.HealthcareDto;

public class HealthcareRepositoryImplementation implements HealthcareRepository {
    private HealthcareDto[] dtos = new HealthcareDto[10]; // Maximum 10 healthcare facilities
    private int index = 0;

    @Override
    public boolean save(HealthcareDto healthcareDto) {
        if (index < dtos.length) {
            dtos[index++] = healthcareDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public HealthcareDto[] readAll() {
        return dtos;
    }
}
