//Use a for loop to print only odd numbers between 1 and 30.
package LOOPstatements;
import java.util.Scanner;
public class oddnumusingfor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
