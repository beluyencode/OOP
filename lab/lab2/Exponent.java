package lab.lab2;


import java.util.Scanner;

public class Exponent {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int base;
        int exp;

        System.out.print("Enter the base: ");
        base = input.nextInt();
        System.out.print("Enter the exponent: ");
        exp = input.nextInt();

        System.out.printf("%d raises to the power of %d: %d", base, exp, exponent(base, exp));
        System.out.println();

    }

    public static int exponent(int base, int exp) {
        int product=1;
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }
}
