package homework.homework1;


import java.util.Scanner;

public class SquarePattern {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=input.nextInt();
        for (int row=1;row<=size;row++){
            for (int col=1;col<=size;col++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
