package com.xworkz.sweets.service;

import com.xworkz.sweets.dto.SweetsDto;

public interface SweetsService {
    boolean validateAndSave(SweetsDto sweetsDto);
    void readAll();
    boolean isPresent(SweetsDto sweetsDto);
    SweetsDto searchByName(String sweetName);
}
