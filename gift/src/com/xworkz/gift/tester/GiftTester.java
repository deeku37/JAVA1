package com.xworkz.gift.tester;

import com.xworkz.gift.constant.GiftType;
import com.xworkz.gift.dto.GiftDto;
import com.xworkz.gift.service.GiftService;
import com.xworkz.gift.service.GiftServiceImplementation;

public class GiftTester {
    public static void main(String[] args) {
        GiftService giftService = new GiftServiceImplementation();

        // Create new gifts with GiftType
        GiftDto birthdayGift = new GiftDto(
                "Birthday Gift",
                GiftType.BIRTHDAY,
                "New York",
                100.00
        );
        giftService.validateAndSave(birthdayGift);

        GiftDto weddingGift = new GiftDto(
                "Wedding Gift",
                GiftType.WEDDING,
                "Los Angeles",
                200.00
        );
        giftService.validateAndSave(weddingGift);

        giftService.readAll();

        // Search for a specific gift
        String searchName = "Birthday Gift";
        GiftDto foundGift = giftService.searchByName(searchName);

        if (foundGift != null) {
            System.out.println("Gift found: " + foundGift);
        } else {
            System.out.println("Gift not found with name: " + searchName);
        }
    }
}
