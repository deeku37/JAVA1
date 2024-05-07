package com.xworkz.gift.dto;

import com.xworkz.gift.constant.GiftType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GiftDto {
    private String giftName;
    private GiftType giftType;
    private String location;
    private double cost;

    @Override
    public String toString() {
        return "GiftName: " + giftName + ", GiftType: " + giftType
                + ", Location: " + location + ", Cost: $" + cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        GiftDto dto = (GiftDto) obj;
        return giftName.equals(dto.giftName)
                && giftType == dto.giftType
                && location.equals(dto.location);
    }
}
