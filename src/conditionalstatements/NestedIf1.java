//1. POSITIVE if yes THEN wether it is EVEN or ODD

package conditionalstatements;
import java.util.Scanner;
public class NestedIf1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        if(num>0){
            if(num%2==0) {
                System.out.println("EVEN");
            }
            else{
                System.out.println("ODD");
            }
        }
        else{
            System.out.println("ZERO or NEGATIVE");
        }
    }
}
