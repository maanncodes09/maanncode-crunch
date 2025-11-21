import java.util.Scanner;

public class firstandlastdigitt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int first = 0;
        int temp = n;
        int last = n%10;

        while (n != 0) {
            first = n % 10;
            n /= 10;

        }
        System.out.println(first + " ");
        System.out.println(last + " ");
        //System.out.println();
        System.out.println(first + last);
        System.out.println(first * last);
        System.out.println(first + last * 10);

    }
}
