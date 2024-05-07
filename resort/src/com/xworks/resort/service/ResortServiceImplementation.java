package com.xworks.resort.service;

import com.xworks.resort.repository.ResortRepositoryImplementation;
import com.xworkz.resort.dto.ResortDto;
import com.xworkz.resort.repository.ResortRepository;

public class ResortServiceImplementation implements com.xworkz.resort.service.ResortService {
    private ResortRepository resortRepository = new ResortRepositoryImplementation();

    @Override
    public boolean validateAndSave(ResortDto resortDto) {
        if (resortDto == null) {
            System.out.println("ResortDto is null");
            return false;
        }

        if (resortDto.getResortName() == null || resortDto.getResortName().isEmpty()) {
            System.out.println("Resort name is invalid");
            return false;
        }

        if (resortDto.getLocation() == null || resortDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (resortDto.getCostPerNight() <= 0) {
            System.out.println("Cost per night must be positive");
            return false;
        }

        if (isPresent(resortDto)) {
            System.out.println("ResortDto already exists");
            return false;
        }

        boolean saved = resortRepository.save(resortDto);
        if (saved) {
            System.out.println("ResortDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save ResortDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        ResortDto[] resortArray = resortRepository.readAll();
        if (resortArray != null) {
            for (ResortDto dto : resortArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(ResortDto resortDto) {
        ResortDto[] resortArray = resortRepository.readAll();
        if (resortArray != null) {
            for (ResortDto dto : resortArray) {
                if (dto != null && dto.equals(resortDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public ResortDto searchByName(String resortName) {
        ResortDto[] resortArray = resortRepository.readAll();
        if (resortArray != null) {
            for (ResortDto dto : resortArray) {
                if (dto != null && dto.getResortName().equalsIgnoreCase(resortName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
