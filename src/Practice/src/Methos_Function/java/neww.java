package Methos_Function.java;

public class neww {
    // Ques.   Enter a functional interface, calculate the square of two numbers.
    // Note:   Use lambda expression for the square method.
    //
    public static void main(String[] args) {

            SquareCalculator calc = (a, b) -> (a * a) + (b * b);

            int num1 = 6;
            int num2 = 5;

            int result = calc.square(num1, num2);
            System.out.println("Sum of squares of " + num1 + " and " + num2 + " is: " + result);
        }

}
@FunctionalInterface
interface SquareCalculator {
    int square(int a, int b);
}