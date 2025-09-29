/* A Java program to check if a number is even or odd. */
import java.util.Scanner;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an integer: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an Even Number.");
        } else {
            System.out.println(num + " is an Odd Number.");
        }
        scanner.close();
    }
}