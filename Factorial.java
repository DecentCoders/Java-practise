import java.util.Scanner;
/* A Java program to calculate the factorial of a non-negative integer.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();
        scanner.close();
        // We check if the input number is negative and print an error if it is.
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long factorialResult = calculateFactorial(number);
            System.out.println("The factorial of " + number + " is: " + factorialResult);
        }
    }
    public static long calculateFactorial(int n) {
        // The factorial of 0 is 1 by definition.
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
