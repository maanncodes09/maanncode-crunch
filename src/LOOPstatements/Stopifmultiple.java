//Write a program using a for loop that prints all numbers from 1 to 100, but stops if the number is divisible by 13 (break).
package LOOPstatements;
import java.util.Scanner;
public class Stopifmultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 13 == 0)
                break;
            System.out.println(i);
        }
    }
}