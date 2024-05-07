package com.xworkz.sweets.tester;

import com.xworkz.sweets.dto.SweetsDto;
import com.xworkz.sweets.service.SweetsService;
import com.xworkz.sweets.service.SweetsServiceImplementation;

public class SweetsTester {
    public static void main(String[] args) {
        SweetsService sweetsService = new SweetsServiceImplementation();

        // Creating a new sweets
        SweetsDto gulabJamun = new SweetsDto("Gulab Jamun", "India", 10.99);
        sweetsService.validateAndSave(gulabJamun);

        SweetsDto rasgulla = new SweetsDto("Rasgulla", "India", 8.99);
        sweetsService.validateAndSave(rasgulla);

        sweetsService.readAll();

        // Searching by name
        String searchName = "Gulab Jamun";
        SweetsDto foundSweet = sweetsService.searchByName(searchName);

        if (foundSweet != null) {
            System.out.println("Sweet found: " + foundSweet);
        } else {
            System.out.println("Sweet not found with name: " + searchName);
        }
    }
}
