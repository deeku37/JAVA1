package com.xworkz.wheather.repository;

import com.xworkz.wheather.dto.WheatherDto;

public class WheatherRepositoryImplementation implements WheatherRepository {
    private WheatherDto[] dtos = new WheatherDto[10]; // Maximum 10 records
    private int index = 0;

    @Override
    public boolean save(WheatherDto wheatherDto) {
        if (index < dtos.length) {
            dtos[index++] = wheatherDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public WheatherDto[] readAll() {
        return dtos;
    }
}
