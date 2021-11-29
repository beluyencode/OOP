package lab.lab1;
import java.util.Scanner;

public class SumProductMinMax3 {
   private static Scanner scanner;
   public static void main(String[] args) {
      
      scanner = new Scanner(System.in);

      System.out.print(" Enter 1st integer : ");
      int a = scanner.nextInt();
      System.out.print(" Enter 2nd integer : ");
      int b = scanner.nextInt();
      System.out.print(" Enter 3rd integer : ");
      int c = scanner.nextInt();
      
      System.out.println("The sum is : "+(a+b+c));
      System.out.println("The product is : "+a*b*c);
      int max = Math.max(Math.max(a,b),c);
      int min = Math.min(Math.min(a,b),c);
      System.out.println("The min is : "+min);
      System.out.println("The max is : "+max);
   }
    
}   
