package homework.homework6.bai4;

import homework.homework6.bai3.Movable;

public class MovableCircle implements Movable {
    private double radius;
    private homework.homework6.bai3.MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, double radius) {
        this.radius = radius;
        this.center = new homework.homework6.bai3.MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return center.toString() + ",radius=" + radius;
    }
}
