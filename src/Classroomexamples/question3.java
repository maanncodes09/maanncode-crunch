package Classroomexamples;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Move of Player A
        String moveA = sc.nextLine();

        String moveB = "";  // to store the winning move for Player B

        // Decision making
        if (moveA.equals("rock")) {
            moveB = "paper";      // paper beats rock
        }
        else if (moveA.equals("paper")) {
            moveB = "scissors";   // scissors beat paper
        }
        else if (moveA.equals("scissors")) {
            moveB = "rock";       // rock beats scissors
        }
        else {
            System.out.println("Invalid input");
            return;
        }

        // Output
        System.out.println(moveB);
    }

}
