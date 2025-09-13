package LOOPstatements;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number ");
        int n= sc.nextInt();
        for(int a=2; a<=n;a++){
            boolean isprime= true;
            for(int i=2; i<= a/2;i++){
                if(a%i==0){
                    isprime=false;
                    break;
                }
            }
                if(isprime){
                    System.out.println(a);
                }
            }
    }
}
