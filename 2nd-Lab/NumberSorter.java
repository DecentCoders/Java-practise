import java.util.Scanner;
public class NumberSorter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = 0;
        System.out.println("Please enter 10 integers:");
        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            if (input.hasNextInt()) {
                numbers[count] = input.nextInt();
                count++;
            } else {
                System.out.println("Error: Only integers are allowed. Please re-enter.");
                input.next(); 
            }
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted numbers (ascending):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        input.close();
    }
}