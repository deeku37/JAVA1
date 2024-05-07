package com.xworkz.party.tester;

import com.xworkz.party.constant.PartyType;
import com.xworkz.party.dto.PartyDto;
import com.xworkz.party.service.PartyService;
import com.xworkz.party.service.PartyServiceImplementation;

public class PartyTester {
    public static void main(String[] args) {
        PartyService partyService = new PartyServiceImplementation();

        // Create new parties with PartyType
        PartyDto birthdayParty = new PartyDto(
                "Birthday Party",
                PartyType.BIRTHDAY,
                "New York",
                500.00
        );
        partyService.validateAndSave(birthdayParty);

        PartyDto weddingParty = new PartyDto(
                "Wedding Party",
                PartyType.WEDDING,
                "Los Angeles",
                5000.00
        );
        partyService.validateAndSave(weddingParty);

        partyService.readAll();

        // Search for a specific party
        String searchName = "Birthday Party";
        PartyDto foundParty = partyService.searchByName(searchName);

        if (foundParty != null) {
            System.out.println("Party found: " + foundParty);
        } else {
            System.out.println("Party not found with name: " + searchName);
        }
    }
}
