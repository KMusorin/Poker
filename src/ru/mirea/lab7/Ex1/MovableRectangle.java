package ru.mirea.lab7.Ex1;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isSpeedTest() {
        return topLeft.getxSpeed() == bottomRight.getySpeed();
    }

    @Override
    public void up() {
        if (isSpeedTest()) {
            topLeft.setY(topLeft.getY() + topLeft.getySpeed());
            bottomRight.setY(bottomRight.getY() + bottomRight.getySpeed());
            System.out.println(this);
        } else {
            moveError();
        }
    }

    @Override
    public void down() {
        if (isSpeedTest()) {
            topLeft.setY(topLeft.getY() + topLeft.getySpeed());
            bottomRight.setY(bottomRight.getY() + bottomRight.getySpeed());
            System.out.println(this);
        } else {
            moveError();
        }
    }

    @Override
    public void left() {
        if (isSpeedTest()) {
            topLeft.setX(topLeft.getX() - topLeft.getxSpeed());
            bottomRight.setX(topLeft.getX() - bottomRight.getxSpeed());
            System.out.println(this);
        } else {
            moveError();
        }
    }

    @Override
    public void right() {
        if (isSpeedTest()) {
            topLeft.setX(topLeft.getX() + topLeft.getxSpeed());
            bottomRight.setX(bottomRight.getX() + bottomRight.getxSpeed());
            System.out.println(this);
        } else {
            moveError();
        }
    }

    private void moveError() {
        System.out.println("Невозможно передвижение объекта");
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
