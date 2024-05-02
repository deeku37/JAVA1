package com.xworkz.cartoons.repository;


import com.xworkz.cartoons.dto.CartoonsDto;


public interface CartoonsRepository {
    boolean save(CartoonsDto cartoonsDto);

    CartoonsDto[] readAll();

}
