package com.xworkz.metro.dto;

import com.xworkz.metro.constant.MetroType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MetroDto {
    private String metroName;
    private MetroType metroType;
    private String location;
    private double length; // in kilometers

    @Override
    public String toString() {
        return "MetroName: " + metroName + ", MetroType: " + metroType
                + ", Location: " + location + ", Length: " + length + " km";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        MetroDto dto = (MetroDto) obj;
        return metroName.equals(dto.metroName)
                && metroType == dto.metroType
                && location.equals(dto.location);
    }
}
