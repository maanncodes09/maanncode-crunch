package LOOPstatements;
import java.util.Scanner;
public class reversedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int digit = 0;
        int reverse = 0;
        while (n!=0) {
            digit = n % 10; //gets last digit
            reverse = reverse * 10 + digit;
            n = n / 10; // removes last digit
        }
            System.out.println(reverse);

        }
    }

