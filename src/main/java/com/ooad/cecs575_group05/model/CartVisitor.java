package com.ooad.cecs575_group05.model;

public interface CartVisitor {
    int visit(LuxuryProduct luxuryProduct);
    int visit(GroceryProduct groceryProduct);
}
