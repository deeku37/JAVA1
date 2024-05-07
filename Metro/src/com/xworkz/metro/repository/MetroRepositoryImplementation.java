package com.xworkz.metro.repository;

import com.xworkz.metro.dto.MetroDto;

public class MetroRepositoryImplementation implements MetroRepository {
    private MetroDto[] dtos = new MetroDto[10]; // Maximum 10 records
    private int index = 0;

    @Override
    public boolean save(MetroDto metroDto) {
        if (index < dtos.length) {
            dtos[index++] = metroDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public MetroDto[] readAll() {
        return dtos;
    }
}
