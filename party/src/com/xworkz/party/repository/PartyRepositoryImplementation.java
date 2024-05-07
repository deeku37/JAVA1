package com.xworkz.party.repository;

import com.xworkz.party.dto.PartyDto;

public class PartyRepositoryImplementation implements PartyRepository {
    private PartyDto[] dtos = new PartyDto[10]; // Maximum 10 parties
    private int index = 0;

    @Override
    public boolean save(PartyDto partyDto) {
        if (index < dtos.length) {
            dtos[index++] = partyDto;
            return true;
        } else {
            System.out.println("Repository is full");
            return false;
        }
    }

    @Override
    public PartyDto[] readAll() {
        return dtos;
    }
}
