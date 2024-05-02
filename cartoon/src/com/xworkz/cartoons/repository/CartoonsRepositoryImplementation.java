package com.xworkz.cartoons.repository;

import com.xworkz.cartoons.dto.CartoonsDto;





public class CartoonsRepositoryImplementation implements CartoonsRepository{
    CartoonsDto[] dtos   = new CartoonsDto[4];
    int index = 0 ;
    @Override
    public boolean save(CartoonsDto cartoonsDto){
        System.out.println("save operation started");
        if(index< dtos.length){
            index++;
            dtos[index++] = cartoonsDto;
            System.out.println(" saved successfully");
            return true;
        }
        return false;

    }
    public CartoonsDto[] readAll(){
        System.out.println("entered");
        return dtos;
    }

}
