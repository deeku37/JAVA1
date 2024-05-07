package com.xworkz.sweets.repository;

import com.xworkz.sweets.dto.SweetsDto;

public class SweetsRepositoryImplementation implements SweetsRepository {
    private SweetsDto[] dtos = new SweetsDto[10]; // Maximum 10 sweets
    private int index = 0;

    @Override
    public boolean save(SweetsDto sweetsDto) {
        if (index < dtos.length) {
            dtos[index++] = sweetsDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public SweetsDto[] readAll() {
        return dtos;
    }
}
