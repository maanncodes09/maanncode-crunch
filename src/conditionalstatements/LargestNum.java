package conditionalstatements;
import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUM a");
        int a= sc.nextInt();
        System.out.println("ENTER NUM b");
        int b= sc.nextInt();
        System.out.println("ENTER NUM c");
        int c= sc.nextInt();

        if(a>b && a>c){
            System.out.println("LARGEST number is :"+a);
        }
        else if(b>a && b>c){
            System.out.println("LARGEST number is:"+b);
        }
        else{
            System.out.println("LARGEST number is:"+c);
        }
    }
}
