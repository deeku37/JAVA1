package com.amazon.amazonapp.products;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Products {

    private String name;
    private double price;
    private String quantity;
    @Override
    public String toString(){
        return "Products-(Name = "+this.name+" , Price = "+this.price+" , Quantity = "+this.quantity+"  ) ";
    }
}
