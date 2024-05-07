package com.xworkz.roadtrip.service;

import com.xworkz.roadtrip.dto.RoadtripDto;

public interface RoadtripService {
    boolean validateAndSave(RoadtripDto roadtripDto);
    void readAll();
    boolean isPresent(RoadtripDto roadtripDto);
    RoadtripDto searchByName(String roadtripName);
}
