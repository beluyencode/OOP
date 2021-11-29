package homework.homework6.bai1;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color,Boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public double getPermieter() {
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return "Circle["+super.toString()+",radius="+this.radius+"]";
    }
    
}
