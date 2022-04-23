package com.ooad.cecs575_group05.model;

public class LuxuryProduct extends Product implements AcceptVisitor{

    private int cost;
    private String prodIdentificationName;

    public LuxuryProduct(int cost, String prodIdentificationName) {
        this.cost = cost;
        this.prodIdentificationName = prodIdentificationName;
    }

    public int getCost() {
        return cost;
    }

    public String getProdIdentificationName() {
        return prodIdentificationName;
    }

    @Override
    public int accept(CartVisitor visitor) {
        return visitor.visit(this);
    }
}
