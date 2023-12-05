package ru.mirea.lab4.Ex3;

public class Product {
    private String name;
    private double price;
    private Catalogs catalog;

    public Product(String name, double price, Catalogs catalog) {
        this.name = name;
        this.catalog = catalog;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name = '" + name + '\'' +
                ", price = " + price + "}";
    }
}
