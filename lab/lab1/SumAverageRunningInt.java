package lab.lab1;


public class SumAverageRunningInt {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        double average = 0;

        for (int i = lowerbound; i <= upperbound; i++) {
            sum = sum + i;
            average = average + (double) i/upperbound;
           
        }

        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average is " + average);

    }
}
