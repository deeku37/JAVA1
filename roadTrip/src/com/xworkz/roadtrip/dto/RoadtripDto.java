package com.xworkz.roadtrip.dto;

import com.xworkz.roadtrip.constant.RoadtripType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RoadtripDto {
    private String roadtripName;
    private RoadtripType roadtripType;
    private String location;
    private double duration; // in hours

    @Override
    public String toString() {
        return "RoadtripName: " + roadtripName + ", RoadtripType: " + roadtripType
                + ", Location: " + location + ", Duration: " + duration + " hours";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        RoadtripDto dto = (RoadtripDto) obj;
        return roadtripName.equals(dto.roadtripName)
                && roadtripType == dto.roadtripType
                && location.equals(dto.location);
    }
}
