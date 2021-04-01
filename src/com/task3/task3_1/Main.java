package com.task3.task3_1;

import com.task3.task3_1.CreateProduct;

import static com.task3.task3_1.SpecialProduct.applyOffOnProduct;

public class Main {
    public static void main(String[] args) {
        CreateProduct product1 = new CreateProduct("Onion",78);
        CreateProduct product2 = new CreateProduct("Onion",78);
        CreateProduct product3 = new CreateProduct("Tomato",58);


        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        if(product1.equals(product2)){
            System.out.println("Two Products are equal");
        }

        SpecialProduct sp2 = applyOffOnProduct(product3,20);
        System.out.println(sp2);
    }
}
