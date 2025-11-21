package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class even_odd_positions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = new int[n];

        int even = 0;
        int odd = 1;
        for(int num: arr){
            if(num%2==0){
                result[even]=num;
                even+=2;
            }
            else{
                result[odd]=num;
                odd+=2;
            }
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

        System.out.println();
        System.out.println(Arrays.toString(result));
    }

}
