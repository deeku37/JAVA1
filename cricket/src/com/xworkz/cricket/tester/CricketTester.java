package com.xworkz.cricket.tester;

import com.xworkz.cricket.constant.CricketPlayerName;
import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.service.CricketService;
import com.xworkz.cricket.service.CricketServiceImplmentations;
public class CricketTester {
    public static void main(String[] args) {
        CricketDto cricketDto = new CricketDto("VIRAT", "BANGLORE", 12/05/2024);

        System.out.println(cricketDto);

        CricketService cricketService = new CricketServiceImplmentations();
        boolean isValid = cricketService.validateAndSave(cricketDto);
    }
}
