package com.task3.task3_1;

public class CreateProduct {
    String name;
    int price;

    public CreateProduct() {
    }

    public CreateProduct(String name,int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d ",name,price);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(!(obj instanceof CreateProduct)){
            return false;
        }
        CreateProduct product = (CreateProduct) obj;
        return name.equals(product.name) && Integer.compare(price,product.price)==0;
    }
}
