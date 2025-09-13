package conditionalstatements;
import java.util.Scanner;
public class Divisbility {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("Divisible by both");
        }
        else if(n%3==0){
            System.out.println("Divisible by 3");
        }
        else if(n%5==0){
            System.out.println("Divisible by 5");
        }
        else{
            System.out.println("Indivisible");
        }
    }
}