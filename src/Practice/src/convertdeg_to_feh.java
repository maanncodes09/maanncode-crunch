import java.util.Scanner;

public class convertdeg_to_feh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in degree: ");
        int deg = sc.nextInt();
        float feh = (deg*9/5)+32;
        System.out.println("The Feh Degree in degree: "+feh);
    }
}
