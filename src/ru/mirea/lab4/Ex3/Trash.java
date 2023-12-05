package ru.mirea.lab4.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Trash {

    private List<Product> products = new ArrayList<>();

    public void buy() {

    }

    public void viewProducts() {
        for (Product product : products) {
            System.out.println(products.indexOf(product) + ". " + product);
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Товар " + product.getName() + " успешно добавлен");
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }
}