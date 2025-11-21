import java.util.Scanner;

public class sumofdigitsofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            product = product * digit;
            n = n / 10;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);

    }
}
