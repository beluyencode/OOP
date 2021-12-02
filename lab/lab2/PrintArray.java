package lab.lab2;


import java.util.Scanner;

public class PrintArray {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        final int NUM_ITEMS;
        int[] items;

        System.out.print("Enter the number of items: ");
        NUM_ITEMS=input.nextInt();
        items=new int[NUM_ITEMS];

        if (items.length>0) {
            System.out.print("Enter the value of all items (seperated by space): ");
            for (int i=0;i< items.length;++i){
                items[i]= input.nextInt();
            }
            System.out.println();
        }

        for (int i=0;i< items.length;++i){
            if (i==0){
                System.out.print("The values are: ["+items[i]);
            }else if(i==items.length-1){
                System.out.print(", "+items[i]+"]");
            }
            else {
                System.out.print(", "+items[i]);
            }
        }
        System.out.println();
    }
}
