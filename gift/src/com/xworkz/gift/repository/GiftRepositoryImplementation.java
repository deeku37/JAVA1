package com.xworkz.gift.repository;

import com.xworkz.gift.dto.GiftDto;

public class GiftRepositoryImplementation implements GiftRepository {
    private GiftDto[] dtos = new GiftDto[10]; // Maximum 10 gifts
    private int index = 0;

    @Override
    public boolean save(GiftDto giftDto) {
        if (index < dtos.length) {
            dtos[index++] = giftDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public GiftDto[] readAll() {
        return dtos;
    }
}
