package com.xworkz.gift.repository;

import com.xworkz.gift.dto.GiftDto;

public interface GiftRepository {
    boolean save(GiftDto giftDto);
    GiftDto[] readAll();
}
