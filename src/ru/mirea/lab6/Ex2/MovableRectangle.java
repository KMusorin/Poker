package ru.mirea.lab6.Ex2;


public class MovableRectangle implements Movable {
    private final MovablePoints topLeft;
    private final MovablePoints bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoints(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoints(x2, y2, xSpeed, ySpeed);
    }

    public boolean isSpeedPoints() {
        return topLeft.getxSpeed() == bottomRight.getySpeed();
    }

    @Override
    public void moveUp() {
        if (isSpeedPoints()) {
            topLeft.setY(topLeft.getY() + topLeft.getySpeed());
            bottomRight.setY(bottomRight.getY() + bottomRight.getySpeed());
            System.out.println(this);
        }else
        moveError();
    }

    @Override
    public void moveDown() {
        if (isSpeedPoints()) {
            topLeft.setY(topLeft.getY() - topLeft.getySpeed());
            bottomRight.setY(bottomRight.getY() - bottomRight.getySpeed());
            System.out.println(this);
        }else
        moveError();
    }

    @Override
    public void moveLeft() {
        if (isSpeedPoints()) {
            topLeft.setX(topLeft.getX() - topLeft.getxSpeed());
            bottomRight.setX(bottomRight.getX() - bottomRight.getxSpeed());
            System.out.println(this);
        }else
        moveError();
    }

    @Override
    public void moveRight() {
        if (isSpeedPoints()) {
            topLeft.setX(topLeft.getX() + topLeft.getxSpeed());
            bottomRight.setX(bottomRight.getX() + bottomRight.getxSpeed());
            System.out.println(this);
        }else
        moveError();
    }

    private void moveError() {
        System.out.println("Невозможно передвижение объекта");
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft = " + topLeft +
                ", bottomRight = " + bottomRight +
                '}';
    }
}
