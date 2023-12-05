package ru.mirea.lab6.Ex2;

public class TestRectangle {
    public static void main(String[] args) {

        MovableRectangle rectangle = new MovableRectangle(5, 5, 10, 10, 2, 2);
        System.out.println("Start");
        System.out.println(rectangle);
        System.out.println("Up");
        rectangle.moveUp();
        System.out.println("Down");
        rectangle.moveDown();
        System.out.println("Left");
        rectangle.moveLeft();
        System.out.println("Right");
        rectangle.moveRight();
    }
}
