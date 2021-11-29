package lab.lab1;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    private static Scanner ipusScanner;

    public static void main(String[] args) {
        final int SALARYCEILING = 6000;
        final double EMPLOYEERATE55ANDBELOW = 0.2;
        final double EMPLOYERRATE55ANDBELOW = 0.17;
        final double EMPLOYEERATE55TO60 = 0.13;
        final double EMPLOYERRATE55TO60 = 0.13;
        final double EMPLOYEERATE60TO65 = 0.075;
        final double EMPLOYERRATE60TO65 = 0.09;
        final double EMPLOYEERATE65ABOVE = 0.05;
        final double EMPLOYERRATE65ABOVE = 0.075;
        ipusScanner = new Scanner(System.in);

        layer1 : while (true) {
            System.out.printf("Enter the  monthly saraly (or -1 to end) : $");
            int saraly = ipusScanner.nextInt();
            if (saraly == -1) {
                System.out.println("Bye");
                break layer1;
            }
            System.out.printf("Enter the age : ");
            int age = ipusScanner.nextInt();

            if (saraly >= SALARYCEILING) {
                saraly = 6000;
            }
            

            double phamtramEmployee = 0.0;
            double phamtramEmployer = 0.0;
            if (age <= 55) {
                phamtramEmployee = EMPLOYEERATE55ANDBELOW;
                phamtramEmployer = EMPLOYERRATE55ANDBELOW;
            } else if (age > 55 && age <= 60) {
                phamtramEmployee = EMPLOYEERATE55TO60;
                phamtramEmployer = EMPLOYERRATE55TO60;
            } else if (age > 60 && age <= 65) {
                phamtramEmployee = EMPLOYEERATE60TO65;
                phamtramEmployer = EMPLOYERRATE60TO65;
            } else {
                phamtramEmployee = EMPLOYEERATE65ABOVE;
                phamtramEmployer = EMPLOYERRATE65ABOVE;
            }

            double employee = saraly * phamtramEmployee;
            double employer = saraly * phamtramEmployer;
            double sum = employee + employer;

            System.out.printf("The employee’s contribution is : %.2f \n", employee);
            System.out.printf("The employer’s contribution is : %.2f \n", employer);
            System.out.printf("The total contribution is : %.2f \n",sum);

        }

    }
}
