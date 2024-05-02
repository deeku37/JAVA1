package com.xworkz.college.repository;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepositoryImplementation implements CollegeRepository {
    private CollegeDto[] dtos = new CollegeDto[10];
    private int index = 0;

    @Override
    public boolean save(CollegeDto collegeDto) {
        System.out.println("save operation started");
        if (index < dtos.length) {
            dtos[index++] = collegeDto;
            return true;
        } else {
            System.out.println("Repository is full");
        }
        return false;
    }
    public CollegeDto[] readAll() {
        System.out.println("entered");
        return dtos;
    }

}