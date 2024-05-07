package com.xworkz.healthcare.dto;

import com.xworkz.healthcare.constant.HealthcareType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HealthcareDto {
    private String healthcareName;
    private HealthcareType healthcareType;
    private String location;
    private double cost;

    @Override
    public String toString() {
        return "HealthcareName: " + healthcareName + ", HealthcareType: " + healthcareType
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

        HealthcareDto dto = (HealthcareDto) obj;
        return healthcareName.equals(dto.healthcareName)
                && healthcareType == dto.healthcareType
                && location.equals(dto.location);
    }
}
