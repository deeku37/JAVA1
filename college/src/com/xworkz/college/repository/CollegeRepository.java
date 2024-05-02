package com.xworkz.college.repository;

import com.xworkz.college.dto.CollegeDto;

public interface CollegeRepository {
    boolean save(CollegeDto collegeDto);

    CollegeDto[] readAll();
}
