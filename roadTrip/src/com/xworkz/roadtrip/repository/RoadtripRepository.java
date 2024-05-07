package com.xworkz.roadtrip.repository;

import com.xworkz.roadtrip.dto.RoadtripDto;

public interface RoadtripRepository {
    boolean save(RoadtripDto roadtripDto);
    RoadtripDto[] readAll();
}
