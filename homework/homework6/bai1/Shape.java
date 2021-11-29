package homework.homework6.bai1;

public abstract class Shape {
    private String color;
    private Boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Boolean isFilled() {
        return this.filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public double getArea();

    abstract public double getPermieter();

    @Override
    public String toString() {
        return "Shape[color=" + this.getColor() + ",filled=" + this.isFilled() + "]";
    }
}
