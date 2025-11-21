import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        int sum = 0;

        // Count the number of digits
        int tempCount = n;
        while (tempCount != 0) {
            tempCount /= 10;
            count++;
        }

        // Calculate the sum of digits raised to the power of count
        int tempSum = n;
        while (tempSum != 0) {
            int digit = tempSum % 10;
            sum += Math.pow(digit, count);
            tempSum /= 10;
        }

        // Check if the number is an Armstrong number
        if (sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}