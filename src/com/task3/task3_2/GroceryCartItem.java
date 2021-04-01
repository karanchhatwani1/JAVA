package com.task3.task3_2;

public class GroceryCartItem extends GroceryItem{
    int price;
    float quantity;

    public GroceryCartItem(String name, int pricePerKg) {
        super(name, pricePerKg);
    }

    @Override
    public String toString() {
        return String.format("%s (Rs%d * %fkg) = Rs%d",this.name,this.pricePerKg,this.quantity,this.price);
    }
    static float extractQuantity(String quantityStr){
        String quan[] = quantityStr.split(" ");
        String s1 = quan[0].replace("kg","");
        String s2 = quan[1].replace("g","");
        int a[] = new int[2];
        a[0] = Integer.parseInt(s1);
        a[1] = Integer.parseInt(s2);

        float f1 = (float) a[0];
        float f2 = (float) (a[1]/1000);
        float weight = f1+f2;

        return weight;
    }
    static GroceryCartItem createNew(GroceryItem item,String quantityStr){
        GroceryCartItem cartItem = new GroceryCartItem(item.name, item.pricePerKg);
        cartItem.quantity = GroceryCartItem.extractQuantity(quantityStr);
        cartItem.price = (int)(cartItem.pricePerKg*cartItem.quantity);
        return cartItem;
    }
}
