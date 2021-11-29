package homework.homework6.bai2;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getRadius());

        Rectangle rect = new Rectangle(2,3);

        System.out.println(rect);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
    }
}
