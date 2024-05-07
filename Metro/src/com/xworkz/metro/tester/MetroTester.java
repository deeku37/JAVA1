package com.xworkz.metro.tester;

import com.xworkz.metro.constant.MetroType;
import com.xworkz.metro.dto.MetroDto;
import com.xworkz.metro.service.MetroService;
import com.xworkz.metro.service.MetroServiceImplementation;

public class MetroTester {
    public static void main(String[] args) {
        MetroService metroService = new MetroServiceImplementation();

        // Create new Metro lines with MetroType
        MetroDto undergroundLine = new MetroDto(
                "Underground Line 1",
                MetroType.UNDERGROUND,
                "London",
                15.0 // in kilometers
        );
        metroService.validateAndSave(undergroundLine);

        MetroDto elevatedLine = new MetroDto(
                "Elevated Line 2",
                MetroType.ELEVATED,
                "Tokyo",
                12.0 // in kilometers
        );
        metroService.validateAndSave(elevatedLine);

        metroService.readAll();

        // Search for a specific Metro line
        String searchName = "Underground Line 1";
        MetroDto foundMetro = metroService.searchByName(searchName);

        if (foundMetro != null) {
            System.out.println("Metro line found: " + foundMetro);
        } else {
            System.out.println("Metro line not found with name: " + searchName);
        }
    }
}
