package com.example.visitor;

public class Main {
    public static void main(String[] args) {
        // Создаем элементы
        Book book1 = new Book("Java Programming", 30.0);
        Book book2 = new Book("Design Patterns", 40.0);
        Fruit apple = new Fruit("Apple", 2.5);
        Fruit banana = new Fruit("Banana", 1.5);

        // Создаем корзину и добавляем товары
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(book1);
        cart.addItem(book2);
        cart.addItem(apple);
        cart.addItem(banana);

        // Создаем визитёра для подсчета общей стоимости
        TotalCostVisitor totalCostVisitor = new TotalCostVisitor();

        // Принимаем визитора для всех элементов в корзине
        cart.accept(totalCostVisitor);

        // Выводим результат

        System.out.println("Total cost: " + totalCostVisitor.getTotalCost());
    }
}
