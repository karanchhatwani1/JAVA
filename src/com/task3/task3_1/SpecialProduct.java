package com.task3.task3_1;

public class SpecialProduct extends CreateProduct {
    int regularPrice;
    int percentageOff;

    public SpecialProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return String.format("Regular Price : %d & Percentage off : %d\nHence Discounted Price : %d", regularPrice,
                percentageOff, price);
    }

    static SpecialProduct applyOffOnProduct(CreateProduct product, int percentageOff) {
        int discountPrice = product.price - product.price * percentageOff / 100;
        SpecialProduct specialProduct = new SpecialProduct(product.name, discountPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;

        return specialProduct;
    }
}
