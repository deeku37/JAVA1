package com.xworkz.metro.service;

import com.xworkz.metro.dto.MetroDto;
import com.xworkz.metro.repository.MetroRepository;
import com.xworkz.metro.repository.MetroRepositoryImplementation;

public class MetroServiceImplementation implements MetroService {
    private MetroRepository metroRepository = new MetroRepositoryImplementation();

    @Override
    public boolean validateAndSave(MetroDto metroDto) {
        if (metroDto == null) {
            System.out.println("MetroDto is null");
            return false;
        }

        if (metroDto
                .getMetroName() == null || metroDto.getMetroName().isEmpty()) {
            System.out.println("Metro name is invalid");
            return false;
        }

        if (metroDto.getLocation() == null || metroDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (metroDto.getLength() <= 0) {
            System.out.println("Length must be positive");
            return false;
        }

        if (isPresent(metroDto)) {
            System.out.println("MetroDto already exists");
            return false;
        }

        boolean saved = metroRepository.save(metroDto);
        if (saved) {
            System.out.println("MetroDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save MetroDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        MetroDto[] metroArray = metroRepository.readAll();
        if (metroArray != null) {
            for (MetroDto dto : metroArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(MetroDto metroDto) {
        MetroDto[] metroArray = metroRepository.readAll();
        if (metroArray != null) {
            for (MetroDto dto : metroArray) {
                if (dto != null && dto.equals(metroDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public MetroDto searchByName(String metroName) {
        MetroDto[] metroArray = metroRepository.readAll();
        if (metroArray != null) {
            for (MetroDto dto : metroArray) {
                if (dto != null && dto.getMetroName().equalsIgnoreCase(metroName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
