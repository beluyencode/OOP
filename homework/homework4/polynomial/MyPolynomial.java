package homework.homework4.polynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        if (getDegree() == 0)
            return "" + coeffs[0];
        if (getDegree() == 1)
            return coeffs[1] + "x + " + coeffs[0];
        String res = coeffs[getDegree()] + "x^" + getDegree();
        for (int i = getDegree() - 1; i >= 1; i--) {
            if (i > 1) {
                if (coeffs[i] == 0) {
                    continue;
                } else if (coeffs[i] > 0) {
                    res += " + " + coeffs[i] + "x^" + i;
                } else {
                    res += "-" + ((-1) * coeffs[i]);
                }
            } else {
                res += " + " + coeffs[1] + "x + " + coeffs[0];
            }
        }
        return res;
    }

    public double evaluate(double x) {
        double term = 1;
        double eva = coeffs[0];
        for (int i = 1; i <= getDegree(); i++) {
            term *= x;
            eva += coeffs[i] * term;
        }
        return eva;
    }

    public MyPolynomial add(MyPolynomial right) {

        int newDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[newDegree + 1];
        if (newDegree == this.getDegree()) {
            for (int i = this.getDegree(); i > right.getDegree(); i--) {
                newCoeffs[i] = this.coeffs[i];
            }
            for (int i = right.getDegree(); i >= 0; i--) {
                newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
        } else {
            for (int i = right.getDegree(); i > this.getDegree(); i--) {
                newCoeffs[i] = right.coeffs[i];
            }
            for (int i = this.getDegree(); i >= 0; i--) {
                newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }
}
