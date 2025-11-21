package String;

import java.util.Scanner;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        String temp="";
        for(int j=s.length()-1; j>=0; j--){
            temp = temp+s.charAt(j)+"";
        }

        if(s.equals(temp)){
            System.out.println("Plaindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
