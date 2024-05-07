package com.xworkz.google.service;

import com.xworkz.google.dto.GoogleDto;

public interface GoogleService {
    boolean validateAndSave(GoogleDto googleDto);
    void readAll();
    boolean isPresent(GoogleDto googleDto);
    GoogleDto searchByName(String googleName);
}
