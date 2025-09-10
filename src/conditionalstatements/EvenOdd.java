package conditionalstatements;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("It is a Even number");
        }
        else{
            System.out.println("Its is a Odd number");
        }
    }
}
