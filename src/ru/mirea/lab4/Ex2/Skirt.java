package ru.mirea.lab4.Ex2;

public class Skirt extends Clothes implements WomenClothing{

    Skirt(Sizes clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println(this);
    }
}
