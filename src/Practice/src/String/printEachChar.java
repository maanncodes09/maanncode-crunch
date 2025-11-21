package String;

import java.util.Scanner;

public class printEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        for(int i=0; i<A.length();i++){
            System.out.println(A.charAt(i));
        }
    }
}
