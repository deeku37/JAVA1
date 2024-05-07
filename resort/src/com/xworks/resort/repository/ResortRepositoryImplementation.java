package com.xworks.resort.repository;

import com.xworkz.resort.dto.ResortDto;

public class ResortRepositoryImplementation implements com.xworkz.resort.repository.ResortRepository {
    private ResortDto[] dtos = new ResortDto[10]; // Maximum 10 resorts
    private int index = 0;

    @Override
    public boolean save(ResortDto resortDto) {
        if (index < dtos.length) {
            dtos[index++] = resortDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public ResortDto[] readAll() {
        return dtos;
    }
}
