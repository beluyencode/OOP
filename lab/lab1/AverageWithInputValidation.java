package lab.lab1;

import java.util.Scanner;

public class AverageWithInputValidation {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 1; i <= 3; i++) {
            layer: while (true) {
                System.out.print("Enter the mark (0−100) for student "+i+" : ");
                int var = scan.nextInt();
                if (var >= 0 && var <= 100) {
                    sum += var;
                    break layer;
                }else{
                    System.out.println("Invalid input , try again...");
                }
            }
        }
        System.out.printf("The average is : %.2f",((double) sum/3));
        System.out.println();
    }
}
