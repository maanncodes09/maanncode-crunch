import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        System.out.println("enter a number: ");
        int m = sc.nextInt();

        System.out.println(Math.pow(n,m));
    }
}
