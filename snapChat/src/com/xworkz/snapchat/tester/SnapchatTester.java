package com.xworkz.snapchat.tester;

import com.xworkz.snapchat.constant.SnapchatType;
import com.xworkz.snapchat.dto.SnapchatDto;
import com.xworkz.snapchat.service.SnapchatService;
import com.xworkz.snapchat.service.SnapchatServiceImplementation;

public class SnapchatTester {
    public static void main(String[] args) {
        SnapchatService snapchatService = new SnapchatServiceImplementation();

        // Create new Snapchat divisions with SnapchatType
        SnapchatDto snapMap = new SnapchatDto(
                "Snap Map",
                SnapchatType.SNAP_MAP,
                "California",
                100.0 // in millions of users
        );
        snapchatService.validateAndSave(snapMap);

        SnapchatDto arLens = new SnapchatDto(
                "AR Lens",
                SnapchatType.AR_LENS,
                "New York",
                150.0 // in millions of users
        );
        snapchatService.validateAndSave(arLens);

        snapchatService.readAll();

        // Search for a specific Snapchat division
        String searchName = "Snap Map";
        SnapchatDto foundSnapchat = snapchatService.searchByName(searchName);

        if (foundSnapchat != null) {
            System.out.println("Snapchat division found: " + foundSnapchat);
        } else {
            System.out.println("Snapchat division not found with name: " + searchName);
        }
    }
}
