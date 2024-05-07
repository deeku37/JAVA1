package com.xworkz.roadtrip.service;

import com.xworkz.roadtrip.dto.RoadtripDto;
import com.xworkz.roadtrip.repository.RoadtripRepository;
import com.xworkz.roadtrip.repository.RoadtripRepositoryImplementation;

public class RoadtripServiceImplementation implements RoadtripService {
    private RoadtripRepository roadtripRepository = new RoadtripRepositoryImplementation();

    @Override
    public boolean validateAndSave(RoadtripDto roadtripDto) {
        if (roadtripDto == null) {
            System.out.println("RoadtripDto is null");
            return false;
        }

        if (roadtripDto.getRoadtripName() == null || roadtripDto.getRoadtripName().isEmpty()) {
            System.out.println("Roadtrip name is invalid");
            return false;
        }

        if (roadtripDto.getLocation() == null || roadtripDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (roadtripDto.getDuration() <= 0) {
            System.out.println("Duration must be positive");
            return false;
        }

        if (isPresent(roadtripDto)) {
            System.out.println("RoadtripDto already exists");
            return false;
        }

        boolean saved = roadtripRepository.save(roadtripDto);
        if (saved) {
            System.out.println("RoadtripDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save RoadtripDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        RoadtripDto[] roadtripArray = roadtripRepository.readAll();
        if (roadtripArray != null) {
            for (RoadtripDto dto : roadtripArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(RoadtripDto roadtripDto) {
        RoadtripDto[] roadtripArray = roadtripRepository.readAll();
        if (roadtripArray != null) {
            for (RoadtripDto dto : roadtripArray) {
                if (dto != null && dto.equals(roadtripDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public RoadtripDto searchByName(String roadtripName) {
        RoadtripDto[] roadtripArray = roadtripRepository.readAll();
        if (roadtripArray != null) {
            for (RoadtripDto dto : roadtripArray) {
                if (dto != null && dto.getRoadtripName().equalsIgnoreCase(roadtripName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
