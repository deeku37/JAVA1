package com.xworkz.college.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CollegeDto {
    private String collegeName;
    private String location;
    private int establishedYear;
    private int studentCount;

    @Override
    public String toString() {
        return "CollegeName: " + collegeName + ", Location: " + location + ", EstablishedYear: " + establishedYear + ", StudentCount: " + studentCount;
    }
}
