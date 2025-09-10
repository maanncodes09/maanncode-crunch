//Check if a number is two-digit, if yea the whether it is even


package conditionalstatements;
import java.util.Scanner;
public class NestedIf2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if(n>=10 && n<=99){
            if(n%2==0){
                System.out.println("EVEN");
            }
            else{
                System.out.println("ODD");
            }
        }
        else{
            System.out.println("Not a two-digit number");
        }
    }
}
