import java.util.Scanner;
class A {
    private final int v = 100;
    public int getV() {
        return v;
    }
}
public class GuessingGame {
    public static void main(String[] args) {
        A a = new A();
        int target = a.getV();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean firstWrongGuess = true; 
            System.out.println("Welcome to the Guessing Game! Try to guess the secret number.");
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess > target) {
                    System.out.println("Too big! Try again.");
                    if (firstWrongGuess) {
                        System.out.println("Hint: The number is a perfect square (e.g., 10x10, 5x5).");
                        firstWrongGuess = false; 
                    }
                } else if (guess < target) {
                    System.out.println("Too small! Try again.");
                    if (firstWrongGuess) {
                        System.out.println("Hint: The number is a perfect square (e.g.,5x5,10x10).");
                        firstWrongGuess = false; 
                    }
                } else {
                    System.out.println("Congratulations! You guessed the number correctly!");
                    break;
                }
            }
            scanner.close();
        }
    }
}