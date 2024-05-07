package com.xworkz.google.tester;

import com.xworkz.google.constant.GoogleType;
import com.xworkz.google.dto.GoogleDto;
import com.xworkz.google.service.GoogleService;
import com.xworkz.google.service.GoogleServiceImplementation;

public class GoogleTester {
    public static void main(String[] args) {
        GoogleService googleService = new GoogleServiceImplementation();

        // Create new Google divisions with GoogleType
        GoogleDto cloudDivision = new GoogleDto(
                "Google Cloud",
                GoogleType.CLOUD,
                "California",
                1200.00 // in millions
        );
        googleService.validateAndSave(cloudDivision);

        GoogleDto searchEngineDivision = new GoogleDto(
                "Google Search",
                GoogleType.SEARCH_ENGINE,
                "California",
                1500.00 // in millions
        );
        googleService.validateAndSave(searchEngineDivision);

        googleService.readAll();

        // Search for a specific Google division
        String searchName = "Google Cloud";
        GoogleDto foundGoogle = googleService.searchByName(searchName);

        if (foundGoogle != null) {
            System.out.println("Google division found: " + foundGoogle);
        } else {
            System.out.println("Google division not found with name: " + searchName);
        }
    }
}
