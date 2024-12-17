package com.example.visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
