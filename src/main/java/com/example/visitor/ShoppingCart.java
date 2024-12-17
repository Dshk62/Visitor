package com.example.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Element> items = new ArrayList<>();

    public void addItem(Element item) {
        items.add(item);
    }

    public void accept(Visitor visitor) {
        for (Element item : items) {
            item.accept(visitor);
        }
    }
}
