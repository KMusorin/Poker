package ru.mirea.lab7.Ex1;

public class RectangleTest {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(10, 10, 5, 5, 2, 2);
        System.out.println("Start");
        System.out.println(rectangle);
        System.out.println("Up");
        rectangle.up();
        System.out.println("Down");
        rectangle.down();
        System.out.println("Left");
        rectangle.left();
        System.out.println("Right");
        rectangle.right();
    }
}
