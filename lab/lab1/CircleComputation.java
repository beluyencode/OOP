package lab.lab1;

import java.util.Scanner;

public class CircleComputation {
    
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.print("Enter  the radius : ");
        double radius = input.nextDouble();
        double diameter = 2.0*radius;
        double Circumference =2.0*radius*Math.PI;
        double area = radius*radius*Math.PI;
        System.out.printf("Diameter is : %.2f \n",diameter);
        System.out.printf("Circumference is : %.2f \n",Circumference);
        System.out.printf("Area is : %.2f \n",area);

    }


}
