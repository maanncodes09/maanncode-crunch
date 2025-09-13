package LOOPstatements;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        int factorial=1;
        int i=n;
        while(i>0){
            factorial=factorial*i;
            i-- ;
        }
        System.out.println(factorial);
    }

}
