package com.xworkz.cartoons.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class CartoonsDto {

    private String cartoonName;
    private String cartoonCharacterName;
    private int noOfCharacters;

    @Override
    public String toString(){
        return "cartoonName : " + cartoonName + " , " + "getCartoonCharacterName : " +cartoonCharacterName+ " , " + "noOfCharacters :" +noOfCharacters;
    }
}
