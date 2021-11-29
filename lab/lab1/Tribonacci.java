package lab.lab1;


public class Tribonacci {
    public static int tribonacci (int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 1;
        }
        if(n == 3 ){
            return 2;
        }
        return tribonacci(n-1) + tribonacci(n-2) +tribonacci(n-3);
    }
    public static void main(String[] args) {
        int sum = 0;
       
        System.out.println("The first 20 Fibonacci numbers are :");
        for (int i = 1; i <= 20; i++) {
            System.out.print(tribonacci(i)+" ");
            sum += tribonacci(i);
        }
        System.out.println("");
        System.out.println("The average is : " + (double) sum/20);

    }
    
}
