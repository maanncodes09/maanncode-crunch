package Control_Statements;

import java.util.Scanner;

public class Facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int a = 1; a <= n; a++){
            fact = fact * a;
        }
        System.out.println(fact);
    }
}
