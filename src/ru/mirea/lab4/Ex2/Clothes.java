package ru.mirea.lab4.Ex2;

public abstract class Clothes {
    private Sizes clothingSize;
    private int price;
    private String color;

    Clothes(Sizes clothingSize, int price, String color){
        this.clothingSize = clothingSize;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Clothes{" + "type = " + this.getClass().getSimpleName() +
                ", clothingSize = " + clothingSize +
                ", price = " + price +
                ", color = '" + color + '\'' +
                '}';
    }
}
