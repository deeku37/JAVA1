package com.xworkz.wheather.tester;

import com.xworkz.wheather.constant.WheatherType;
import com.xworkz.wheather.dto.WheatherDto;
import com.xworkz.wheather.service.WheatherService;
import com.xworkz.wheather.service.WheatherServiceImplementation;


public class WheatherTester {
    public static void main(String[] args) {
        WheatherService wheatherService = new WheatherServiceImplementation();

        // Create new wheather data with WheatherType
        WheatherDto sunnyWeather = new WheatherDto(
                "Sunny Weather",
                WheatherType.SUNNY,
                "California",
                30.0
        );
        wheatherService.validateAndSave(sunnyWeather);

        WheatherDto stormyWeather = new WheatherDto(
                "Stormy Weather",
                WheatherType.STORMY,
                "Texas",
                25.0
        );
        wheatherService.validateAndSave(stormyWeather);

        wheatherService.readAll();

        // Search for specific weather
        String searchName = "Sunny Weather";
        WheatherDto foundWeather = wheatherService.searchByName(searchName);

        if (foundWeather != null) {
            System.out.println("Weather found: " + foundWeather);
        } else {
            System.out.println("Weather not found with name: " + searchName);
        }
    }
}
