package com.xworkz.gift.service;

import com.xworkz.gift.dto.GiftDto;
import com.xworkz.gift.repository.GiftRepository;
import com.xworkz.gift.repository.GiftRepositoryImplementation;

public class GiftServiceImplementation implements GiftService {
    private GiftRepository giftRepository = new GiftRepositoryImplementation();

    @Override
    public boolean validateAndSave(GiftDto giftDto) {
        if (giftDto == null) {
            System.out.println("GiftDto is null");
            return false;
        }

        if (giftDto.getGiftName() == null || giftDto.getGiftName().isEmpty()) {
            System.out.println("Gift name is invalid");
            return false;
        }

        if (giftDto.getLocation() == null || giftDto.getLocation().isEmpty()) {
            System.out.println("Location is invalid");
            return false;
        }

        if (giftDto.getCost() <= 0) {
            System.out.println("Cost must be positive");
            return false;
        }

        if (isPresent(giftDto)) {
            System.out.println("GiftDto already exists");
            return false;
        }

        boolean saved = giftRepository.save(giftDto);
        if (saved) {
            System.out.println("GiftDto saved successfully");
            return true;
        } else {
            System.out.println("Failed to save GiftDto");
            return false;
        }
    }

    @Override
    public void readAll() {
        GiftDto[] giftArray = giftRepository.readAll();
        if (giftArray != null) {
            for (GiftDto dto : giftArray) {
                if (dto != null) {
                    System.out.println(dto);
                }
            }
        }
    }

    @Override
    public boolean isPresent(GiftDto giftDto) {
        GiftDto[] giftArray = giftRepository.readAll();
        if (giftArray != null) {
            for (GiftDto dto : giftArray) {
                if (dto != null && dto.equals(giftDto)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public GiftDto searchByName(String giftName) {
        GiftDto[] giftArray = giftRepository.readAll();
        if (giftArray != null) {
            for (GiftDto dto : giftArray) {
                if (dto != null && dto.getGiftName().equalsIgnoreCase(giftName)) {
                    return dto;
                }
            }
        }
        return null;
    }
}
