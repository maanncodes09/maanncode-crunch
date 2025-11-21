package Classroomexamples;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the temperature in celcius: ");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Safe for outdoor activites.");
        }
        else{
            System.out.println("Too cold for outdoor activites.");
        }
    }
}
