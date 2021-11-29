package homework.homework5.part1.bai4;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("A Shape with color of %s and" +
                "%s filled", color, filled ? "" : " Not");
    }
}
