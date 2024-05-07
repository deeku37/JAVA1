package com.xworkz.party.repository;

import com.xworkz.party.dto.PartyDto;

public interface PartyRepository {
    boolean save(PartyDto partyDto);
    PartyDto[] readAll();
}
