package com.xworkz.cricket.service;

import com.xworkz.cricket.dto.CricketDto;

public class CricketServiceImplmentations implements CricketService{


    @Override
    public boolean validateAndSave(CricketDto cricketDto) {
        if (cricketDto != null) {
            System.out.println("The cake is not null");
            return true;
        }
        return false;
    }
}
