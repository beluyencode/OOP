package lab.lab2;


import java.util.Scanner;

public class MagicSum {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        int sum = 0;
        int inputInt = 0;

        while (inputInt != -1) {
            System.out.print("Enter a positive integer (or -1 to end):");
            inputInt = input.nextInt();
            if (hasEight(inputInt)) {
                sum += inputInt;
            }
        }
        System.out.print("The magic sum is:" + sum);
        System.out.println();

    }

    public static boolean hasEight(int inputInt) {
        while (inputInt > 0) {
            if (inputInt % 10 == 8)
                return true;
            else
                inputInt /= 10;
        }
        return false;
    }
}
