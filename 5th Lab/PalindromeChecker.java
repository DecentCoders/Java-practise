import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        System.out.println("Welcome to the Palindrome Checker!");

        do {
            String input;
            do {
                System.out.print("Enter a string to check: ");
                input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Oops! Please enter a non-empty string.\n");
                }
            } while (input.isEmpty());

            String removedNonAlpha = input.replaceAll("[^a-zA-Z0-9]", "");
            String cleanedString = removedNonAlpha.toLowerCase();

            System.out.println("\n The String is : " + cleanedString);

            boolean isPalindrome = checkPalindrome(cleanedString);
            if (isPalindrome) {
                System.out.println("Result: This is a palindrome!");
            } else {
                System.out.println("Result: This is NOT a palindrome.");
            }
            do {
                System.out.print("\nCheck another string? (y/n): ");
                continueInput = scanner.nextLine().trim().toLowerCase();
                if (!continueInput.matches("[yn]")) {
                    System.out.println("Please enter 'y' (yes) or 'n' (no).");
                }
            } while (!continueInput.matches("[yn]"));

            System.out.println();

        } while (continueInput.equals("y"));

        System.out.println("Thanks  for using the checker! Goodbye!");
        scanner.close();
    }

    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}