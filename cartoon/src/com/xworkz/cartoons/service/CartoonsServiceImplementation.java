package com.xworkz.cartoons.service;

import com.xworkz.cartoons.constant.CartoonsName;
import com.xworkz.cartoons.dto.CartoonsDto;
import com.xworkz.cartoons.repository.CartoonsRepository;
import com.xworkz.cartoons.repository.CartoonsRepositoryImplementation;

public class CartoonsServiceImplements implements CartoonsService{


    CartoonsRepository cartoonsRepository =  new CartoonsRepositoryImplementation();
    @Override
    public boolean validateAndSave(CartoonsDto cartoonsDto) {
        if(cartoonsDto != null){
            System.out.println("not null" );
            if(cartoonsDto.getCartoonName()!= null && cartoonsDto.getCartoonCharacterName() != null && cartoonsDto.getNoOfCharacters()>0){
                System.out.println("dto is not null");
                if(isPresent(cartoonsDto)==false){
                    boolean save=  cartoonsRepository.save(cartoonsDto);
                    System.out.println("saved:"+save);
                    if(save) {
                        return true;
                    }
                }

            }else {
                System.out.println("dto is null");

            }
        }  //null check condition

        return false;
    }
    @Override
    public void readAll(){
        CartoonsDto[] cartoonsDto =   cartoonsRepository.readAll();
        if(cartoonsDto!= null){
            for(CartoonsDto dto : cartoonsDto){
                System.out.println(dto);
            }
        }
    }

    public boolean isPresent(CartoonsDto cartoonsDto){
        CartoonsDto[] cartoonsDto1 =   cartoonsRepository.readAll();
        if(cartoonsDto1 != null){
            for(CartoonsDto dto :cartoonsDto1 ){
                if(dto == cartoonsDto){
                    System.out.println("Already Present");
                    return true;
                }
            }

        }
        return false;
    }
}
