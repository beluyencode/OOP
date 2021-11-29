package lab.lab1;

import java.util.Scanner;

public class InputValidation {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        layer1 : while(true) {
            System.out.print("Enter a number between 0−10 o r 90−100 : ");
            int n = scan.nextInt();
            if (n >= 0 && n <= 10 || n >= 90 && n <= 100) {
                System.out.println("You have entered : " + n);
                break layer1;
            }else {
                System.out.println("Invalid input , try again...");
            }
        }
    }
    
}
