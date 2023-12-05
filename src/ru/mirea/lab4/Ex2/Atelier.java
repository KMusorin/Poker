package ru.mirea.lab4.Ex2;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[]{
                new TShirt(Sizes.XXS, 100, "black"),
                new Pants(Sizes.L, 200, "grey"),
                new Skirt(Sizes.S, 150, "brown"),
                new Tie(Sizes.XS, 300, "pink")};
        Sizes size = Sizes.XS;
        System.out.println("----------Women clothing----------");
        dressWomen(clothes);
        System.out.println("----------Men clothing----------");
        dressMan(clothes);
//        System.out.println(getDescription(size));
    }

    public static String getDescription(Sizes size) {
        if (size == Sizes.XXS) {
            return "Детский размер";
        }
        return size.getDescription();
    }

    public static void dressWomen(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }
    public static void dressMan(Clothes[] clothes){
        for (Clothes item: clothes){
            if (item instanceof MenClothing){
                ((MenClothing) item).dressMan();
            }
        }
    }
}