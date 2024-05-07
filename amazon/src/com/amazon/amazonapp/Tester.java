package com.amazon.amazonapp;

import com.amazon.amazonapp.amazon.Amazon;
import com.amazon.amazonapp.products.Products;

import javax.naming.Name;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of product to be added");
        int size = sc.nextInt();

        Amazon amazon = new Amazon(size);

        for(int index=0 ; index<size ; index++){
            Products products =new Products();
            System.out.println("Enter the name of the Product");
            String name = sc.next();
            products.setName(name);

            System.out.println("enter the price ");
            double price = sc.nextDouble();
            products.setPrice(price);

            System.out.println("enter the quantity");
            String quantity = sc.next();
            products.setQuantity(quantity);

            amazon.addProducts(products);
        }

       /* Products products = new Products();
        products.setName("Charger");
        products.setPrice(500.00);
        products.setQuantity("2");

        Products products1 = new Products();
        products1.setName("Iron box");
        products1.setPrice(950.00);
        products1.setQuantity("1");

        Products products2 = new Products();
        products2.setName("Bag pack");
        products2.setPrice(1060.00);
        products2.setQuantity("3");

        Products products3 = new Products();
        products3.setName("Indoor plant");
        products3.setPrice(2500.00);
        products3.setQuantity("5");



        amazon.addProducts(products);
        amazon.addProducts(products1);
        amazon.addProducts(products2);
        amazon.addProducts(products3);*/

        String input = null;
        do {
            System.out.println("Press 1 : To get all the details of Products");
            System.out.println("Press 2 : To get  Product info By Name");
            System.out.println("Press 3 : To get  Product info By Price");
            System.out.println("Press 4 : To get  Product info By Name");
            System.out.println("Press 5 : To get  Product Name By Price");
            System.out.println("Press 6 : To get  Product Price By Name");


            int options = sc.nextInt();
            switch (options) {

                case 1:amazon.getProducts();
                    break;

                case 2:System.out.println("Enter the Name of the required product :");
                    String name = sc.next();
                    amazon.getProductsByName(name);
                    break;

                case 3 :System.out.println("Enter the Price of the required product :");
                    double price = sc.nextDouble();
                    amazon.getProductsByPrice(price);
                    break;

                case 4: System.out.println("Enter the Price of the required product :");
                    double price1 = sc.nextDouble();
                    amazon.getProductsNameByPrice(price1);
                    break;

                case 5: System.out.println("Enter the Name of the required product :");
                    String name1 = sc.next();
                    amazon.getProductsPriceByName(name1);
                    break;

                default:
                    System.out.println("Please Enter valid input ");
            }
            System.out.println("Do you wish to continue ");
            System.out.println("Enter Yes/No ");
            input = sc.next();
        }while (input.equals("Yes"));
        System.out.println("enter price to updatePrice");
        double updatedPrice = sc.nextDouble();
        String productName = sc.next();
        boolean productUpdatePrice = amazon.updateProductPriceByName(sc.nextDouble(), sc.next());
        System.out.println(productUpdatePrice);
          xbreak;



    }
}
