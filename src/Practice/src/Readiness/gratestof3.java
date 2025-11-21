package Readiness;

import java.util.*;

public class gratestof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if(n>m && n>k){
            System.out.println(n+" is greatest.");
        }
        else if(m>n && m>k){

            System.out.println(m+" is greatest.");
        }
        else{
            System.out.println(k+" is greatest.");
        }
    }
}
