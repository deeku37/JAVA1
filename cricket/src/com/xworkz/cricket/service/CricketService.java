package com.xworkz.cricket.service;

import com.xworkz.cricket.dto.CricketDto;

public interface CricketService {

    boolean validateAndSave(CricketDto cricketDto);
}
