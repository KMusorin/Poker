package ru.mirea.lab4.Ex2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{

    TShirt(Sizes clothingSize, int price, String color) {
        super(clothingSize, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println(this);
    }

    @Override
    public void dressWomen() {
        System.out.println(this);
    }
}
