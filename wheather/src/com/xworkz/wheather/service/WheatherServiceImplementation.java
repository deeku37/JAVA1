package com.xworkz.wheather.service;

import com.xworkz.wheather.dto.WheatherDto;
import com.xworkz.wheather.repository.WheatherRepository;
import com.xworkz.wheather.repository.WheatherRepositoryImplementation;

public class WheatherServiceImplementation implements WheatherService {
    private WheatherRepository wheatherRepository = new WheatherRepositoryImplementation();

    @Override
    public boolean validateAndSave(WheatherDto wheatherDto) {
        if (wheatherDto == null) {
            System.out.println("WheatherDto is null");
            return false;
        }

        if (wheatherDto.getWheatherName() == null || wheatherDto.getWheatherName().isEmpty()) {
            System.out.println("Wheather name is invalid");
            return false;
        }

        if (wheatherDto.getLocation() == null || wheatherDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (wheatherDto.getTemperature() < -50 || wheatherDto.getTemperature() > 60) {
            System.out.println("Temperature is out of range");
            return false;
        }

        if (isPresent(wheatherDto)) {
            System.out.println("WheatherDto already exists");
            return false;
        }

        boolean saved = wheatherRepository.save(wheatherDto);
        if (saved) {
            System.out.println("WheatherDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save WheatherDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        WheatherDto[] wheatherArray = wheatherRepository.readAll();
        if (wheatherArray != null) {
            for (WheatherDto dto : wheatherArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(WheatherDto wheatherDto) {
        WheatherDto[] wheatherArray = wheatherRepository.readAll();
        if (wheatherArray != null) {
            for (WheatherDto dto : wheatherArray) {
                if (dto != null && dto.equals(wheatherDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public WheatherDto searchByName(String wheatherName) {
        WheatherDto[] wheatherArray = wheatherRepository.readAll();
        if (wheatherArray != null) {
            for (WheatherDto dto : wheatherArray) {
                if (dto != null && dto.getWheatherName().equalsIgnoreCase(wheatherName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
