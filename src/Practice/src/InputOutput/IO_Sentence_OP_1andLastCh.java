package InputOutput;

import java.util.Scanner;

public class IO_Sentence_OP_1andLastCh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(i==0){
                System.out.println("First Character: "+s.charAt(i));
            }
            else if(i==s.length()-1){
                System.out.print("Last Character: "+s.charAt(i));
            }
        }
// SAMPLE INPUT: Hello Mathura, Sumansh Yadav this side new MP of Dist. Mathura. I promise you that I'll make mathura cleaniest city in the  world and corruption free. Each  and Every temple will be corruption free from 1st of November VIP Culture from every temples will be removed.Thank You!! ... RADHE-RADHE Brijwasio
// SAMPLE OUTPUT:
//               First Character: H
//               Last Character: o

    }
}
