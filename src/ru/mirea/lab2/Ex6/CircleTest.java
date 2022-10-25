package ru.mirea.lab2.Ex6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Circle circle1 = new Circle(3);
        System.out.println("Площадь окружности = " + circle.getS());
        System.out.println("Длина окружности = " + circle.getCircleLength());
        System.out.println(circle.compareTo(circle1));
    }
}
