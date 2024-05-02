package com.xworkz.watch.service;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repository.WatchRepository;
import com.xworkz.watch.repository.WatchRepositoryImplementation;

public class WatchServiceImplementation implements WatchService {
    private WatchRepository watchRepository = new WatchRepositoryImplementation();

    @Override
    public boolean validateAndSave(WatchDto watchDto) {
        if (watchDto != null) {
            if (watchDto.getWatchName() != null && watchDto.getPrice() > 0 && watchDto.getBrand() != null) {
                if (!isPresent(watchDto)) {
                    boolean saved = watchRepository.save(watchDto);
                    if (saved) {
                        System.out.println("Watch saved successfully");
                        return true;
                    }
                }
            } else {
                System.out.println("Invalid WatchDto fields");
            }
        }
        return false;
    }

    @Override
    public void readAll() {
        WatchDto[] watchDtoArray = watchRepository.readAll();
        if (watchDtoArray != null) {
            for (WatchDto dto : watchDtoArray) {
                System.out.println(dto);
            }
        }
    }

    public boolean isPresent(WatchDto watchDto) {
        WatchDto[] watchDtoArray = watchRepository.readAll();
        if (watchDtoArray != null) {
            for (WatchDto dto : watchDtoArray) {
                if (dto == watchDto) {
                    System.out.println("Already Present");
                    return true;
                }
            }
        }
        return false;
    }
}
