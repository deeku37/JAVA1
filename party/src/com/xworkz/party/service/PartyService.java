package com.xworkz.party.service;

import com.xworkz.party.dto.PartyDto;

public interface PartyService {
    boolean validateAndSave(PartyDto partyDto);
    void readAll();
    boolean isPresent(PartyDto partyDto);
    PartyDto searchByName(String partyName);
}
