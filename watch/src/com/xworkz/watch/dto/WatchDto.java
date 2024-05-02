package com.xworkz.watch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WatchDto {
    private String watchName;
    private String brand;
    private double price;
    private String type;

    @Override
    public String toString() {
        return "WatchName: " + watchName + ", Brand: " + brand + ", Price: " + price + ", Type: " + type;
    }
}
