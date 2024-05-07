package com.xworkz.gift.service;

import com.xworkz.gift.dto.GiftDto;

public interface GiftService {
    boolean validateAndSave(GiftDto giftDto);
    void readAll();
    boolean isPresent(GiftDto giftDto);
    GiftDto searchByName(String giftName);
}
