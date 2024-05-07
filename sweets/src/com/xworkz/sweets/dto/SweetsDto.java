package com.xworkz.sweets.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SweetsDto {
    private String sweetName;
    private String origin;
    private double pricePerKg;

    @Override
    public String toString() {
        return "SweetName: " + sweetName + ", Origin: " + origin + ", PricePerKg: $" + pricePerKg;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        SweetsDto dto = (SweetsDto) obj;
        return sweetName.equals(dto.sweetName) && origin.equals(dto.origin);
    }
}
