package com.xworkz.wheather.service;

import com.xworkz.wheather.dto.WheatherDto;

public interface WheatherService {
    boolean validateAndSave(WheatherDto wheatherDto);
    void readAll();
    boolean isPresent(WheatherDto wheatherDto);
    WheatherDto searchByName(String wheatherName);
}
