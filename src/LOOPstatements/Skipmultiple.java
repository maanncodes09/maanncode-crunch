//Print numbers from 1 to 50, but skip multiples of 5 using continue.

package LOOPstatements;
import java.util.Scanner;
public class Skipmultiple {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        for(int i=1; i<=num;i++){
            if(i%5==0)
                continue;
            System.out.println(i);
        }
    }
}
