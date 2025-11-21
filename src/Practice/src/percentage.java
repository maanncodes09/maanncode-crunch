import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks in Sub.1: ");
        int sub1 = sc.nextInt();
        System.out.println("Enter Marks in Sub.2: ");
        int sub2 = sc.nextInt();
        System.out.println("Enter Marks in Sub.3: ");
        int sub3 = sc.nextInt();
        System.out.println("Enter Marks in Sub.4: ");
        int sub4 = sc.nextInt();
        System.out.println("Enter Marks in Sub.5: ");
        int sub5 = sc.nextInt();

        int per = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("The Result Percentage: "+per);

    }
}
