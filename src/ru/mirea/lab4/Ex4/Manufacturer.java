package ru.mirea.lab4.Ex4;

public enum Manufacturer {
    APPLE("Apple"),
    SAMSUNG("Samsung"),
    HP("HP"),
    LENOVO("Lenovo");

    private final String title;

    Manufacturer(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
