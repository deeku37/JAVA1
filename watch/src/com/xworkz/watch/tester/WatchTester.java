package com.xworkz.watch.tester;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImplementation;

public class WatchTester {
    public static void main(String[] args) {
        WatchDto watchDto = new WatchDto("SMARTWATCH", "SMARTWATCH", 8000, "SMARTWATCH");
        System.out.println(watchDto);
        WatchService watchService = new WatchServiceImplementation();
        boolean result = watchService.validateAndSave(watchDto);
        System.out.println("Watch validation and save result: " + result);
        watchService.validateAndSave(watchDto);
        watchService.readAll();
    }
}
