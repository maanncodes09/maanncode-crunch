package LOOPstatements;
import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        for(int i=n; i<=n*10; i+=n){
            System.out.println(i);
        }
    }
}
