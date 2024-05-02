package com.xworkz.cartoons.service;

import com.xworkz.cartoons.dto.CartoonsDto;

public interface CartoonsService {

    boolean validateAndSave(CartoonsDto cartoonsDto);

    void readAll();
    boolean isPresent(CartoonsDto cartoonsDto);

}
