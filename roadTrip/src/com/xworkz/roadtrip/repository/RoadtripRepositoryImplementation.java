package com.xworkz.roadtrip.repository;

import com.xworkz.roadtrip.dto.RoadtripDto;

public class RoadtripRepositoryImplementation implements RoadtripRepository {
    private RoadtripDto[] dtos = new RoadtripDto[10]; // Maximum 10 roadtrips
    private int index = 0;

    @Override
    public boolean save(RoadtripDto roadtripDto) {
        if (index < dtos.length) {
            dtos[index++] = roadtripDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public RoadtripDto[] readAll() {
        return dtos;
    }
}
