package com.example.visitor;

public class Fruit implements Element {
    private String name;
    private double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
