package String;

import java.util.Scanner;

public class concatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String Result = str1.concat(str2);
        System.out.println(Result);

        if(str1.equals(str2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equals");
        }
    }
}
