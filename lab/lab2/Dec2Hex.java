package lab.lab2;


import java.util.Scanner;

public class Dec2Hex {
    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int number = input.nextInt();
        System.out.print("The equivalent hexadecimal number is:" + d2h(number));
        System.out.println();

    }

    public static String d2h(int n) {
        String hexString = "";
        int i = 0;
        System.out.println(i);
        while (n != 0) {
            int temp = 0;
            temp = n % 16;
            if (temp < 10) {
                hexString += (char) (temp + 48);
                i++;
            } else {
                hexString += (char) (temp + 55);
                i++;
            }
            n = n / 16;
        }
        return hexString;
    }
}
