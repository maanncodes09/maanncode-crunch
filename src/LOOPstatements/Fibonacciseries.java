package LOOPstatements;
//import java.util.Scanner;//
public class Fibonacciseries {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        int n= 10; //sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("here is your fibonacci series"+n);
        for(int i=0; i<=n;i++){
            System.out.println(a+"");

            int next=a+b;
            a=b;
            b=next;
        }
    }
}
