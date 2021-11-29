package homework.homework6.bai5;
import homework.homework6.bai2.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius="+radius+"]";
    }

    @Override
    public double getArea() {
        return  Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
    
}
