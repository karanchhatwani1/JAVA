package com.task3.task3_2;

public class Main {
    public static void main(String[] args) {
        GroceryItem item1 = new GroceryItem("Tomato",78);
        GroceryItem item2 = new GroceryItem("Potato",58);
        GroceryItem item3 = new GroceryItem("Onion",88);
        GroceryItem item4 = new GroceryItem("Cabbage",48);

        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(item1,"3kg 0g"))
                .add(GroceryCartItem.createNew(item2,"2kg 20g"))
                .add(GroceryCartItem.createNew(item3,"1kg 30g"))
                .add(GroceryCartItem.createNew(item4,"0kg 40g"));
        System.out.println(cart);
    }
}
