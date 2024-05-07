package com.xworkz.google.service;

import com.xworkz.google.dto.GoogleDto;
import com.xworkz.google.repository.GoogleRepository;
import com.xworkz.google.repository.GoogleRepositoryImplementation;

public class GoogleServiceImplementation implements GoogleService {
    private GoogleRepository googleRepository = new GoogleRepositoryImplementation();

    @Override
    public boolean validateAndSave(GoogleDto googleDto) {
        if (googleDto == null) {
            System.out.println("GoogleDto is null");
            return false;
        }

        if (googleDto.getGoogleName() == null || googleDto.getGoogleName().isEmpty()) {
            System.out.println("Google name is invalid");
            return false;
        }

        if (googleDto.getLocation() == null || googleDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (googleDto.getRevenue() < 0) {
            System.out.println("Revenue must be positive");
            return false;
        }

        if (isPresent(googleDto)) {
            System.out.println("GoogleDto already exists");
            return false;
        }

        boolean saved = googleRepository.save(googleDto);
        if (saved) {
            System.out.println("GoogleDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save GoogleDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        GoogleDto[] googleArray = googleRepository.readAll();
        if (googleArray != null) {
            for (GoogleDto dto : googleArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(GoogleDto googleDto) {
        GoogleDto[] googleArray = googleRepository.readAll();
        if (googleArray != null) {
            for (GoogleDto dto : googleArray) {
                if (dto != null && dto.equals(googleDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public GoogleDto searchByName(String googleName) {
        GoogleDto[] googleArray = googleRepository.readAll();
        if (googleArray != null) {
            for (GoogleDto dto : googleArray) {
                if (dto != null && dto.getGoogleName().equalsIgnoreCase(googleName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
