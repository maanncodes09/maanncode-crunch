package conditionalstatements;
import java.util.Scanner;
public class PositiveNegZero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        if(num>0){
            System.out.println("POSITIVE");
        }
        else if(num<0){
            System.out.println("NEGATIVE");
        }
        else if(num==0){
            System.out.println("ZERO");
        }
        else{
            System.out.println("Not a Integer number");
        }
    }
}
