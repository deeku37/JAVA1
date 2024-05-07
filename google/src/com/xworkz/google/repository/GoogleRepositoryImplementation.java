package com.xworkz.google.repository;

import com.xworkz.google.dto.GoogleDto;

public class GoogleRepositoryImplementation implements GoogleRepository {
    private GoogleDto[] dtos = new GoogleDto[10]; // Maximum 10 records
    private int index = 0;

    @Override
    public boolean save(GoogleDto googleDto) {
        if (index < dtos.length) {
            dtos[index++] = googleDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public GoogleDto[] readAll() {
        return dtos;
    }
}
