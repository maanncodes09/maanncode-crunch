import java.util.Scanner;

public class fibonacciseries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        int c=a+b;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
