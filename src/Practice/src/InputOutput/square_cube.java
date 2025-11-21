package InputOutput;



import java.util.*;

public class square_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int square=a*a;
        int cube=a*a*a;
        System.out.println(square);
        System.out.println(cube);

        double square1=Math.pow(a,2);
        double cube1=Math.pow(a,3);
        System.out.println(square1);
        System.out.println(cube1);

    }

}
