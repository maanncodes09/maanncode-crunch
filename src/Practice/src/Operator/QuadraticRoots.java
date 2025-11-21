package Operator;

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Coefficients a, b , c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double D = b * b - 4 * a * c;
        if(D>0){
            double root1 = (-b + Math.sqrt(D))/(2*a);
            double root2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("Roots are real and distinct: " + root1 + ", " + root2);
        }
        else if(D==0){
            double root1 = (-b + Math.sqrt(D))/(2*a);
            System.out.println("Roots are real and equal: " + root1);
        }
        else{
            double realPart = -b / (2*a);
            double imagPart = Math.sqrt(-D)/(2*a);
            System.out.println("Roots are imaginary: " + realPart + " ± " + imagPart);
        }
    }
}
