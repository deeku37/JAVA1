package com.xworkz.party.dto;

import com.xworkz.party.constant.PartyType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PartyDto {
    private String partyName;
    private PartyType partyType; // Now with PartyType enum
    private String location;
    private double cost;

    @Override
    public String toString() {
        return "PartyName: " + partyName + ", PartyType: " + partyType
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

        PartyDto dto = (PartyDto) obj;
        return partyName.equals(dto.partyName)
                && partyType == dto.partyType
                && location.equals(dto.location);
    }
}
