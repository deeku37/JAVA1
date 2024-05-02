package com.xworkz.cartoons.tester;

import com.xworkz.cartoons.constant.CartoonsName;
import com.xworkz.cartoons.dto.CartoonsDto;
import com.xworkz.cartoons.service.CartoonsService;
import com.xworkz.cartoons.service.CartoonsServiceImplements;

public class CartoonsTester {
    public static void main(String[] args) {
        CartoonsDto cartoonsDto = new CartoonsDto();
        // cartoonsDto.setCartoonName();
        System.out.println(cartoonsDto);

        CartoonsService cartoonsServiceImplements =new  CartoonsServiceImplements();
        boolean value=   cartoonsServiceImplements.validateAndSave(cartoonsDto);
        System.out.println(value);

        cartoonsServiceImplements.validateAndSave(cartoonsDto);
        cartoonsServiceImplements.readAll();
    }
}
