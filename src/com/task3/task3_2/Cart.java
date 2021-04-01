package com.task3.task3_2;

import java.util.ArrayList;

public class Cart {
    ArrayList<GroceryCartItem> cartItems;
    float totalAmount;

    public Cart() {
        cartItems = new ArrayList<>();
        totalAmount = 0;
    }
    public Cart add(GroceryCartItem item){
        cartItems.add(item);
        totalAmount = totalAmount+ item.price;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cart{\n\tgroceryCartItems = [");
        for(GroceryCartItem ci : cartItems){
            sb.append("\n\t\t"+ci.toString()+",");
        }
        sb.append("\b\n\t],"+"\ntotalAmount = Rs"+totalAmount+"}");
        return sb.toString();
    }
}
