package com.ooad.cecs575_group05.model;

public class GroceryProduct extends Product implements AcceptVisitor{

    private int costPerKg;
    private int quantity;
    private String prodIdentifier;

    public GroceryProduct(int costPerKg, int quantity, String prodIdentifier) {
        this.costPerKg = costPerKg;
        this.quantity = quantity;
        this.prodIdentifier = prodIdentifier;
    }

    public int getCostPerKg() {
        return costPerKg;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProdIdentifier() {
        return prodIdentifier;
    }

    @Override
    public int accept(CartVisitor visitor) {
        return visitor.visit(this);
    }
}
