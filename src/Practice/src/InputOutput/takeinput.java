package InputOutput;

import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name: ");
        String name = sc.nextLine();
        System.out.print("Enter the Age: ");
        int age = sc.nextInt();
        System.out.println(name);
        System.out.println(age);
    }
}
