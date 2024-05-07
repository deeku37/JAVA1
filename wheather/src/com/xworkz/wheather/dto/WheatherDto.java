package com.xworkz.wheather.dto;

import com.xworkz.wheather.constant.WheatherType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WheatherDto {
    private String wheatherName;
    private WheatherType wheatherType;
    private String location;
    private double temperature; // in degrees Celsius

    @Override
    public String toString() {
        return "WheatherName: " + wheatherName + ", WheatherType: " + wheatherType
                + ", Location: " + location + ", Temperature: " + temperature + " °C";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        WheatherDto dto = (WheatherDto) obj;
        return wheatherName.equals(dto.wheatherName)
                && wheatherType == dto.wheatherType
                && location.equals(dto.location);
    }
}
