package com.xworks.resort.tester;

import com.xworks.resort.service.ResortServiceImplementation;
import com.xworkz.resort.constant.ResortType;
import com.xworkz.resort.dto.ResortDto;
import com.xworkz.resort.service.ResortService;

public class ResortTester {
    public static void main(String[] args) {
        ResortService resortService = new ResortServiceImplementation();

        // Create new resorts with ResortType
        ResortDto beachResort = new ResortDto(
                "Beach Resort",
                ResortType.BEACH,
                "Florida",
                200.00
        );
        resortService.validateAndSave(beachResort);

        ResortDto mountainResort = new ResortDto(
                "Mountain Resort",
                ResortType.MOUNTAIN,
                "Colorado",
                300.00
        );
        resortService.validateAndSave(mountainResort);

        resortService.readAll();

        // Search for a specific resort
        String searchName = "Beach Resort";
        ResortDto foundResort = resortService.searchByName(searchName);

        if (foundResort != null) {
            System.out.println("Resort found: " + foundResort);
        } else {
            System.out.println("Resort not found with name: " + searchName);
        }
    }
}
