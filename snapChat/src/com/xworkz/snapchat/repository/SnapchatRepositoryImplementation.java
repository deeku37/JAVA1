package com.xworkz.snapchat.repository;

import com.xworkz.snapchat.dto.SnapchatDto;

public class SnapchatRepositoryImplementation implements SnapchatRepository {
    private SnapchatDto[] dtos = new SnapchatDto[10]; // Maximum 10 records
    private int index = 0;

    @Override
    public boolean save(SnapchatDto snapchatDto) {
        if (index < dtos.length) {
            dtos[index++] = snapchatDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public SnapchatDto[] readAll() {
        return dtos;
    }
}
