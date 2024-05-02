package com.xworkz.watch.repository;

import com.xworkz.watch.dto.WatchDto;

public class WatchRepositoryImplementation implements WatchRepository {
    private WatchDto[] dtos = new WatchDto[10]; // Maximum 10 watches
    private int index = 0;

    @Override
    public boolean save(WatchDto watchDto) {
        if (index < dtos.length) {
            dtos[index++] = watchDto; // Store the WatchDto in the array
            return true;
        } else {
            System.out.println("Repository is full");
        }
        return false;
    }
    public WatchDto[] readAll() {
        System.out.println("entered");
        return dtos;
    }
}
