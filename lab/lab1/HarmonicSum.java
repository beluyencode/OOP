package lab.lab1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int n = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;


        for(int i = 1; i <+ n; i++) {
            sumL2R = sumL2R + (double) 1/i; 
        }

        for(int i = n; i >=1 ; i--) {
            sumR2L = sumR2L + (double) 1/i; 
        }
        System.out.println(sumL2R);
        System.out.println(sumR2L);

    }
    
}
