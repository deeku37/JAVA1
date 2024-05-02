package com.xworkz.college.service;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.repository.CollegeRepository;
import com.xworkz.college.repository.CollegeRepositoryImplementation;

public class CollegeServiceImplementation implements CollegeService {
    private CollegeRepository collegeRepository = new CollegeRepositoryImplementation();

    @Override
    public boolean validateAndSave(CollegeDto collegeDto) {
        if (collegeDto != null) {
            if (collegeDto.getCollegeName() != null && collegeDto.getLocation() != null && collegeDto.getEstablishedYear() > 0) {
                if (isPresent(collegeDto) == false) {
                    boolean saved = collegeRepository.save(collegeDto);
                    if (saved) {
                        System.out.println("College saved successfully");
                        return true;
                    }
                }
            } else {
                System.out.println("Invalid CollegeDto fields");
            }
        }
        return false;
    }

    @Override
    public void readAll() {
        CollegeDto[] collegeDto1 = collegeRepository.readAll();
        if (collegeDto1 != null) {
            for (CollegeDto dto : collegeDto1) {
                System.out.println(dto);
            }
        }
    }

    public boolean isPresent(CollegeDto collegeDto) {
        CollegeDto[] collegeDto1 = collegeRepository.readAll();
        if (collegeDto1 != null) {
            for (CollegeDto dto : collegeDto1) {
                if (dto == collegeDto) {
                    System.out.println("Already Present");
                    return true;
                }
            }
        }
        return false;
    }
}
