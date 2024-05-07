package com.xworkz.party.service;

import com.xworkz.party.dto.PartyDto;
import com.xworkz.party.repository.PartyRepository;
import com.xworkz.party.repository.PartyRepositoryImplementation;

public class PartyServiceImplementation implements PartyService {
    private PartyRepository partyRepository = new PartyRepositoryImplementation();

    @Override
    public boolean validateAndSave(PartyDto partyDto) {
        if (partyDto == null) {
            System.out.println("PartyDto is null");
            return false;
        }

        if (partyDto.getPartyName() == null || partyDto.getPartyName().isEmpty()) {
            System.out.println("Party name is invalid");
            return false;
        }

        if (partyDto.getLocation() == null || partyDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (partyDto.getCost() <= 0) {
            System.out.println("Cost must be positive");
            return false;
        }

        if (isPresent(partyDto)) {
            System.out.println("PartyDto already exists");
            return false;
        }

        boolean saved = partyRepository.save(partyDto);
        if (saved) {
            System.out.println("PartyDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save PartyDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        PartyDto[] partyArray = partyRepository.readAll();
        if (partyArray != null) {
            for (PartyDto dto : partyArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(PartyDto partyDto) {
        PartyDto[] partyArray = partyRepository.readAll();
        if (partyArray != null) {
            for (PartyDto dto : partyArray) {
                if (dto != null && dto.equals(partyDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public PartyDto searchByName(String partyName) {
        PartyDto[] partyArray = partyRepository.readAll();
        if (partyArray != null) {
            for (PartyDto dto : partyArray) {
                if (dto != null && dto.getPartyName().equalsIgnoreCase(partyName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
