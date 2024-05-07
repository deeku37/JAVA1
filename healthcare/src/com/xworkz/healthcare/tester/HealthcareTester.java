package com.xworkz.healthcare.tester;

import com.xworkz.healthcare.constant.HealthcareType;
import com.xworkz.healthcare.dto.HealthcareDto;
import com.xworkz.healthcare.service.HealthcareService;
import com.xworkz.healthcare.service.HealthcareServiceImplementation;

public class HealthcareTester {
    public static void main(String[] args) {
        HealthcareService healthcareService = new HealthcareServiceImplementation();

        // Create new healthcare facilities with HealthcareType
        HealthcareDto hospital = new HealthcareDto(
                "City Hospital",
                HealthcareType.HOSPITAL,
                "New York",
                1500.00
        );
        healthcareService.validateAndSave(hospital);

        HealthcareDto clinic = new HealthcareDto(
                "Downtown Clinic",
                HealthcareType.CLINIC,
                "Los Angeles",
                500.00
        );
        healthcareService.validateAndSave(clinic);

        healthcareService.readAll();

        // Search for a specific healthcare facility
        String searchName = "City Hospital";
        HealthcareDto foundHealthcare = healthcareService.searchByName(searchName);

        if (foundHealthcare != null) {
            System.out.println("Healthcare facility found: " + foundHealthcare);
        } else {
            System.out.println("Healthcare facility not found with name: " + searchName);
        }
    }
}
