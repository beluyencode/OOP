package homework.homework6.bai1;

public class test {
    public static void main(String[] args) {
        Shape Shape1 = new Circle(5.5, "red", false);

        System.out.println(Shape1);
        System.out.println(Shape1.getArea());
        System.out.println(Shape1.getPermieter());
        System.out.println(Shape1.getColor());
        System.out.println(Shape1.isFilled());

        Circle Circle1 = (Circle) Shape1;

        System.out.println(Circle1);
        System.out.println(Circle1.getArea());
        System.out.println(Circle1.getPermieter());
        System.out.println(Circle1.getColor());
        System.out.println(Circle1.isFilled());
        System.out.println(Circle1.getRadius());

        Shape Shape3 = new Rectangle(1.0, 2.0, "red", false);

        Rectangle rectangle1 = (Rectangle) Shape3;

        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPermieter());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());

        Square shape4 = new Square(6.6);

        System.out.println(shape4);
        System.out.println(shape4.getArea());
        System.out.println(shape4.getColor());
        System.out.println(shape4.getSide());

        Rectangle rectangle2 = (Rectangle) shape4;

        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        System.out.println(rectangle2.getLength());
        System.out.println(rectangle2.getWidth());

        Square square1 = (Square) rectangle2;

        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getLength());
        System.out.println(square1.getWidth());

    }
}
