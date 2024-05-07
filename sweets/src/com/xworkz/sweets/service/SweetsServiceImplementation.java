package com.xworkz.sweets.service;

import com.xworkz.sweets.dto.SweetsDto;
import com.xworkz.sweets.repository.SweetsRepository;
import com.xworkz.sweets.repository.SweetsRepositoryImplementation;

public class SweetsServiceImplementation implements SweetsService {
    private SweetsRepository sweetsRepository = new SweetsRepositoryImplementation();

    @Override
    public boolean validateAndSave(SweetsDto sweetsDto) {
        if (sweetsDto == null) {
            System.out.println("SweetsDto is null");
            return false;
        }

        if (sweetsDto.getSweetName() == null || sweetsDto.getSweetName().isEmpty()) {
            System.out.println("Sweet name is invalid");
            return false;
        }

        if (sweetsDto.getPricePerKg() <= 0) {
            System.out.println("Price per kg must be positive");
            return false;
        }

        if (sweetsDto.getOrigin() == null || sweetsDto.getOrigin().isEmpty()) {
            System.out.println("Origin is invalid");
            return false;
        }

        if (isPresent(sweetsDto)) {
            System.out.println("SweetsDto already exists");
            return false;
        }

        boolean saved = sweetsRepository.save(sweetsDto);
        if (saved) {
            System.out.println("SweetsDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save SweetsDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        SweetsDto[] sweetsArray = sweetsRepository.readAll();
        if (sweetsArray != null) {
            for (SweetsDto dto : sweetsArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(SweetsDto sweetsDto) {
        SweetsDto[] sweetsArray = sweetsRepository.readAll();
        if (sweetsArray != null) {
            for (SweetsDto dto : sweetsArray) {
                if (dto != null && dto.equals(sweetsDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public SweetsDto searchByName(String sweetName) {
        SweetsDto[] sweetsArray = sweetsRepository.readAll();
        if (sweetsArray != null) {
            for (SweetsDto dto : sweetsArray) {
                if (dto != null && dto.getSweetName().equalsIgnoreCase(sweetName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
