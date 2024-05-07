package com.xworkz.healthcare.service;

import com.xworkz.healthcare.dto.HealthcareDto;
import com.xworkz.healthcare.repository.HealthcareRepository;
import com.xworkz.healthcare.repository.HealthcareRepositoryImplementation;

public class HealthcareServiceImplementation implements HealthcareService {
    private HealthcareRepository healthcareRepository = new HealthcareRepositoryImplementation();

    @Override
    public boolean validateAndSave(HealthcareDto healthcareDto) {
        if (healthcareDto == null) {
            System.out.println("HealthcareDto is null");
            return false;
        }

        if (healthcareDto.getHealthcareName() == null || healthcareDto.getHealthcareName().isEmpty()) {
            System.out.println("Healthcare name is invalid");
            return false;
        }

        if (healthcareDto.getLocation() == null || healthcareDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (healthcareDto.getCost() <= 0) {
            System.out.println("Cost must be positive");
            return false;
        }

        if (isPresent(healthcareDto)) {
            System.out.println("HealthcareDto already exists");
            return false;
        }

        boolean saved = healthcareRepository.save(healthcareDto);
        if (saved) {
            System.out.println("HealthcareDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save HealthcareDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        HealthcareDto[] healthcareArray = healthcareRepository.readAll();
        if (healthcareArray != null) {
            for (HealthcareDto dto : healthcareArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(HealthcareDto healthcareDto) {
        HealthcareDto[] healthcareArray = healthcareRepository.readAll();
        if (healthcareArray != null) {
            for (HealthcareDto dto : healthcareArray) {
                if (dto != null && dto.equals(healthcareDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public HealthcareDto searchByName(String healthcareName) {
        HealthcareDto[] healthcareArray = healthcareRepository.readAll();
        if (healthcareArray != null) {
            for (HealthcareDto dto : healthcareArray) {
                if (dto != null && dto.getHealthcareName().equalsIgnoreCase(healthcareName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
