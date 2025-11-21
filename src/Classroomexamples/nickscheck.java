package Classroomexamples;

import java.util.*;

public class nickscheck {

        public static int checkConsecutive(int[] arr, int n) {
            Arrays.sort(arr);
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] != 1) {
                    return 0;
                }
            }
            return 1;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(checkConsecutive(arr, n));
            sc.close();
        }

}
