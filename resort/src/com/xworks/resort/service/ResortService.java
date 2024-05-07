package com.xworkz.resort.service;

import com.xworkz.resort.dto.ResortDto;

public interface ResortService {
    boolean validateAndSave(ResortDto resortDto);
    void readAll();
    boolean isPresent(ResortDto resortDto);
    ResortDto searchByName(String resortName);
}
