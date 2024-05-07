package com.xworkz.google.dto;

import com.xworkz.google.constant.GoogleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GoogleDto {
    private String googleName;
    private GoogleType googleType;
    private String location;
    private double revenue; // in millions of dollars

    @Override
    public String toString() {
        return "GoogleName: " + googleName + ", GoogleType: " + googleType
                + ", Location: " + location + ", Revenue: $" + revenue + "M";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        GoogleDto dto = (GoogleDto) obj;
        return googleName.equals(dto.googleName)
                && googleType == dto.googleType
                && location.equals(dto.location);
    }
}
