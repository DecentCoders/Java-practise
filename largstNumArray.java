/**
 * A  Java program to find the largest element in an integer array.
 */
import java.util.Scanner;

public class largstNumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("\nPlease enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        if (numbers == null || numbers.length == 0) {
            System.out.println("The array is empty. Cannot find the largest element.");
            return;
        }
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("\nThe largest element in the array is: " + largest);
    }
}

