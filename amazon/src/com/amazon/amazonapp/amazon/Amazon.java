package com.amazon.amazonapp.amazon;

import com.amazon.amazonapp.products.Products;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Amazon {



    Products[] products;
    int index  ;

    public  Amazon(int size){

        this.products = new Products[size];
    }

    public void addProducts(Products product) {
        System.out.println("inside addProducts():");
        boolean isAdded = false;
        if (product != null) {
            products[index++] = product;
            isAdded = true;
            System.out.println("Product added successfully..");
        } else {
            System.out.println("Product can't be null");
        }
        System.out.println("end of addProducts():");

    }


    public void getProducts() {
        System.out.println("Products:");
        for (Products product : products) {
            System.out.println(product);
        }
    }


    public void getProductsByName(String name){
        System.out.println("Avaliable Product info are : ");
        for(int index= 0;index<this.products.length;index++){
            if (this.products[index].getName().equals(name))
                System.out.println(this.products[index]);
        }

    }
    public void getProductsByPrice(double price){
        System.out.println("Avaliable Product info are : ");
        for (int index= 0;index<this.products.length;index++){
            if (this.products[index].getPrice()==price)
                System.out.println(this.products[index]);
        }

    }
    public String getProductsNameByPrice(double price1) {
        System.out.println("Product price is:" + price1);
        String productNames = new String();
        System.out.println("No of Arg : 1 , double(price)" + price1);
        for (int index = 0; index < this.products.length; index++) {
            if (this.products[index].getPrice() == price1)
                productNames =this.products[index].getName() ;
        }
        System.out.println("name provided is : " +productNames);
        return productNames;
    }
    public double getProductsPriceByName(String name1) {
        System.out.println("Product name is:" + name1);
        double productPrice=0 ;
        System.out.println("No of Arg : 1 , String(name)" + name1);
        for (int index = 0; index < this.products.length; index++) {
            if (this.products[index].getName().equals(name1))
                productPrice =this.products[index].getPrice() ;
        }
        System.out.println("pr provided is : " +productPrice);
        return productPrice;
    }
    public double getQuantityPriceByName(String name1) {
        System.out.println("Product name is:" + name1);
        double productPrice=0 ;
        System.out.println("No of Arg : 1 , String(name)" + name1);
        for (int index = 0; index < this.products.length; index++) {
            if (this.products[index].getName().equals(name1))
                productPrice =this.products[index].getPrice() ;
        }
        System.out.println("pr provided is : " +productPrice);
        return productPrice;
    }
    public boolean updateProductPriceByName(double updatedPrice , String productName){
        System.out.println("getProductPriceByName is started");
        boolean isUpdated = false ;
        System.out.println("No of arg 2 : 1) double (updatedPrice)" + updatedPrice + " 2) String (name)" + productName);

        for(int index =0 ; index< this.products.length ; index++ ){
            if(this.products[index].getName().equals(productName))
                this.products[index].setPrice(updatedPrice);
            isUpdated = true;
        }
        return isUpdated;
    }
}


