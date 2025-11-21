package String;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read both strings from a single line or separate lines
        String A = sc.next();
        String B = sc.next();



        int totalLength = A.length() + B.length();
        System.out.print(totalLength+" ");


        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");



        System.out.print(A.toUpperCase());
        System.out.print(B.toUpperCase());
    }
}
