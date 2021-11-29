package lab.lab1;

public class Fibonacci {
    public static int fibonacci (int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        int sum = 0;
       
        System.out.println("The first 20 Fibonacci numbers are :");
        for (int i = 1; i <= 20; i++) {
            System.out.print(fibonacci(i)+" ");
            sum += fibonacci(i);
        }
        System.out.println("");
        System.out.println("The average is : " + (double) sum/20);

    }
}
