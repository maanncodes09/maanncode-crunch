package LOOPstatements;
import java.util.Scanner;
public class sumofeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum= 0;
        for(int i=2; i<=100; i+=2){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("the sum is"+sum);
    }
}
