import java.util.Scanner;

public class ByteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= -128 && num <= 127) {
            System.out.println(num + " fits in a byte.");
        } else {
            System.out.println(num + " does NOT fit in a byte.");
        }
    }
}
