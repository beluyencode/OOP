package lab.lab1;

import java.util.Scanner;

public class ReverseInt {
    
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.print("Enter apositive integer : ");
        int n = scan.nextInt();
        String a = String.valueOf(n);
        String res ="";
        for (int i = a.length()-1; i >= 0; i--) {
            res+=a.charAt(i);
        }
        int reverse = Integer.parseInt(res);
        System.out.println("The reverse is : " + reverse);

    }
}
