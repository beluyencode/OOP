package homework.homework4.polynomial;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4);
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5, 6.6);
        System.out.println(polynomial1);
        System.out.println(polynomial1.multiply(polynomial2));
        System.out.println(polynomial1.add(polynomial2));

    }
}
