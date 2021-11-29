package homework.homework4.mycomplex;

public class TestMain {
    public static void main(String[] args) {
        MyComplex mycomplex1 = new MyComplex(3.4, 2.8);
        System.out.println(mycomplex1);

        System.out.println("Real is: " + mycomplex1.getReal());
        System.out.println("Imag is: " + mycomplex1.getImag());

        MyComplex mycomplex2 = new MyComplex();
        mycomplex2.setReal(3.4);
        mycomplex2.setImag(0);
        System.out.println(mycomplex2);

        System.out.println(mycomplex2.isImaginary());
        System.out.println(mycomplex2.isReal());

        System.out.println(mycomplex1.equals(mycomplex2));
        System.out.println(mycomplex1.magnitude());

        System.out.println(mycomplex1.addInto(mycomplex2));
        System.out.println(mycomplex1.addNew(mycomplex2));

    }
}
