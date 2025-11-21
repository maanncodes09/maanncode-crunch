package String;

import java.util.Scanner;

public class vowel_consonent_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        int V_count = 0;
        int C_count = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u'){
                V_count++;
            }
            else{
                C_count++;
            }
        }
        System.out.println(V_count);
        System.out.println(C_count);
    }
}
