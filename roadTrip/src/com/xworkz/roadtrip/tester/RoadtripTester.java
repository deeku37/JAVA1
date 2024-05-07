package com.xworkz.roadtrip.tester;

import com.xworkz.roadtrip.constant.RoadtripType;
import com.xworkz.roadtrip.dto.RoadtripDto;
import com.xworkz.roadtrip.service.RoadtripService;
import com.xworkz.roadtrip.service.RoadtripServiceImplementation;

public class RoadtripTester {
    public static void main(String[] args) {
        RoadtripService roadtripService = new RoadtripServiceImplementation();

        // Create new roadtrips with RoadtripType
        RoadtripDto coastalTrip = new RoadtripDto(
                "Coastal Trip",
                RoadtripType.COASTAL,
                "California",
                6.0
        );
        roadtripService.validateAndSave(coastalTrip);

        RoadtripDto mountainTrip = new RoadtripDto(
                "Mountain Trip",
                RoadtripType.MOUNTAIN,
                "Colorado",
                8.0
        );
        roadtripService.validateAndSave(mountainTrip);

        roadtripService.readAll();

        // Search for a specific roadtrip
        String searchName = "Coastal Trip";
        RoadtripDto foundRoadtrip = roadtripService.searchByName(searchName);

        if (foundRoadtrip != null) {
            System.out.println("Roadtrip found: " + foundRoadtrip);
        } else {
            System.out.println("Roadtrip not found with name: " + searchName);
        }
    }
}
