package lab.lab1;

public class ComputePI {
    public static void main(String[] args) {
        double  sum = 0.0;
        int MAX = 10000;
       
        for (int i = 1; i <= MAX; i+=2) {
            if (i % 4 ==1) {
                sum += (double) 1/i;
            }else if(i % 4 == 3 ){
                sum += (double) -1/i;
            }else{
                System.out.println("Impossble!!!");
            }
        }
        double pi = 4 * sum;
        System.out.println(pi);


    }
}
