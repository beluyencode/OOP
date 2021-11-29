package homework.homework4.try_mycomplex;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public String toString() {
        return "(" + getReal() + "+" + getImag() + "i" + ")";
    }

    public boolean isReal() {

        return this.imag == 0;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {

        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.getReal() && this.imag == another.getImag());

    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        double real1 = this.real;
        this.real = this.real * right.getReal() - this.imag * right.getImag();
        this.imag = real1 * right.getImag() + this.imag * right.getReal();
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double real1 = this.real;
        this.real = (this.real * right.getReal() + this.imag * right.getImag())
                / (right.real * right.real + right.imag * right.imag);
        this.imag = ((-1) * real1 * right.getImag() + this.imag * right.getReal())
                / (right.real * right.real + right.imag * right.imag);
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}
