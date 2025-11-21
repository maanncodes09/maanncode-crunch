package Methos_Function.java;

import java.util.*;

public class calc_fact_method {

    public static int calfactorial(int m){
        int fact=1;
        for(int i=1; i<=m;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=calfactorial(n);
        System.out.println(result);

    }
}
