package com.xworkz.resort.dto;

import com.xworkz.resort.constant.ResortType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResortDto {
    private String resortName;
    private ResortType resortType;
    private String location;
    private double costPerNight;

    @Override
    public String toString() {
        return "ResortName: " + resortName + ", ResortType: " + resortType
                + ", Location: " + location + ", Cost per Night: $" + costPerNight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ResortDto dto = (ResortDto) obj;
        return resortName.equals(dto.resortName)
                && resortType == dto.resortType
                && location.equals(dto.location);
    }
}
