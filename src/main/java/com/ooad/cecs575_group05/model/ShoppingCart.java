package com.ooad.cecs575_group05.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<LuxuryProduct> products;

    public ShoppingCart(){
        this.products =new ArrayList<LuxuryProduct>();
    }

    public void addItem(LuxuryProduct product){
        this.products.add(product);
    }

    public void removeItem(LuxuryProduct product){
        this.products.remove(product);
    }

    public int calculateTotalCost(){
        int totalCost = 0;
        for(LuxuryProduct product : products){
            totalCost += product.getCost();
        }
        return totalCost;
    }

    public void payment(MainPayStrategy payMethod){
        int amount = calculateTotalCost();
        payMethod.payment(amount);
    }
}
