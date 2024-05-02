package com.xworkz.college.tester;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImplementation;

public class CollegeTester {
    public static void main(String[] args) {
        CollegeDto collegeDto = new CollegeDto("ENGINEERING ", "ENGINEERING, MA", 1636, 20000);
        System.out.println(collegeDto);
        CollegeService collegeService = new CollegeServiceImplementation();
        boolean result = collegeService.validateAndSave(collegeDto);
        System.out.println("College validation and save result: " + result);
        collegeService.validateAndSave(collegeDto);
        collegeService.readAll();

    }
}
