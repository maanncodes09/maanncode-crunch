//Q.- WAP to find is it a vowel or consonent?

import java.util.Scanner;

public class checkvowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")||str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonent");
        }
    }
}
