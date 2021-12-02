package homework.homework1;


import java.util.Scanner;

public class SquarePattern1 {
    
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size=input.nextInt();
        int row=1;
        int col=1;
        while(row<=size){
            while(col<=size){
                System.out.print("# ");
                col++;
            }
            System.out.println();
            row++;
            col=1;
        }
    }
}
