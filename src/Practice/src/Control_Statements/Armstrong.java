package Control_Statements;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;
        int temp = n;
        int sum = 0;
        int t=n;
        int sum1=0;

        while(n>0){
            digit++;
            n=n/10;
        }


        while(temp>0){
            int  r=temp%10;
            sum = (int)(sum+ (Math.pow(r,digit)));
            temp=temp/10;
            sum1+=r;
        }

        System.out.println(sum1);
        if(t==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

    }
}
