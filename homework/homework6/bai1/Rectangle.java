package homework.homework6.bai1;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setLength(height);
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width*this.length;
    }

    @Override
    public double getPermieter() {
        return (this.width+this.length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle["+super.toString()+","+this.width+","+this.length+"]";
    }

}
