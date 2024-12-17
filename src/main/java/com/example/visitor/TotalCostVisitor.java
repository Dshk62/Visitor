package com.example.visitor;

public class TotalCostVisitor implements Visitor {
    private double totalCost = 0.0;

    @Override
    public void visit(Book book) {
        totalCost += book.getPrice();
    }

    @Override
    public void visit(Fruit fruit) {
        totalCost += fruit.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }
}
