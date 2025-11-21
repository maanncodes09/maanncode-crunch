package Classroomexamples;

import java.util.Scanner;

public class Alices_Magical_Shoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println(count);

    }
}


