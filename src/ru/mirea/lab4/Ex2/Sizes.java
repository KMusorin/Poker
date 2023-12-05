package ru.mirea.lab4.Ex2;

public enum Sizes {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    final int euroSize;
    Sizes(int euroSize){
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "Взрослый размер";
    }
}
