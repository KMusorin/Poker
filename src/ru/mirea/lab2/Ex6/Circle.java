package ru.mirea.lab2.Ex6;

public class Circle {
    private final double PI = 3.14;
    private double r;
    private double s;
    private double c;

    public Circle(double r){
        this.r = r;
        this.s = getS();
        this.c = getCircleLength();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getS(){
        s = PI * Math.pow(r, 2);
        return s;
    }

    public double getCircleLength(){
        c = 2 * PI * r;
        return c;
    }

    public Circle compareTo(Circle otherCircle){
        if (this.r > otherCircle.r){
            return this;
        } else {
           return otherCircle;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI = " + PI +
                ", r = " + r +
                ", s = " + s +
                ", c = " + c +
                '}';
    }
}