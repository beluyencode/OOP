package homework.homework5.part1.bai3;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 1);
        System.out.println(point2D);
        Point3D point3D = new Point3D(1, 2, 4);
        System.out.println(point3D);
        MovablePoint movablePoint = new MovablePoint(1, 1, 2, 3);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
