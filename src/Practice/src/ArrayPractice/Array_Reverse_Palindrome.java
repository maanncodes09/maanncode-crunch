package ArrayPractice;

import java.util.Scanner;

public class Array_Reverse_Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
         int[] arr = new int[n];

         int i;

         for(i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         boolean isPalindrome = true;

         int j;
         for(j=n-1;j>=0;j--){
             System.out.print(arr[j]+" ");
         }
        System.out.println();
         for(i=0;i<n/2;i++){
             if(arr[i]!=arr[n-1-i]){
                 isPalindrome=false;
                 break;
             }
         }
        System.out.println("Is Palindrome: "+isPalindrome);

    }
}
