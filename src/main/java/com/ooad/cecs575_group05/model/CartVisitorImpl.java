package com.ooad.cecs575_group05.model;

public class CartVisitorImpl implements CartVisitor{
    @Override
    public int visit(LuxuryProduct luxuryProduct) {
        int cost=0;
        if(luxuryProduct.getCost() > 1000){
            cost = luxuryProduct.getCost()-20;
        }
        else {
            cost = luxuryProduct.getCost();
        }

        System.out.println("Product Details is---"+luxuryProduct.getProdIdentificationName() + " and cost is calculated to be--- "+cost);
        return cost;
    }

    @Override
    public int visit(GroceryProduct groceryProduct) {
        int cost = groceryProduct.getCostPerKg() * groceryProduct.getQuantity();

        System.out.println("Product Details is---" + groceryProduct.getProdIdentifier() + " and cost is calculated to be--- "+cost);

        return cost;
    }
}
