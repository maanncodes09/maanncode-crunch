package Control_Statements;


import java.util.*;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch1 = sc.nextLine();
        int count = 0;
        int len = ch1.length();

        for(int i=0;i<len;i++){
            char ch = ch1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }

        }
        System.out.println(count);

    }
}
