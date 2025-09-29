import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        String input = sc.nextLine();

        // Case 1: Check if input contains only spaces
        if (input.trim().isEmpty()) {
            System.out.println("A string of spaces can't be reversed.");
            sc.close();
            return;
        }
        sc.close(); 
        // Case 2: Check if all characters are the same
        boolean allSame = true;
        char firstChar = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != firstChar) {
                allSame = false;
                break;
            }
        }
        if (allSame) {
            System.out.println("A string of identical characters can't be shown as reversed.");
            sc.close();
            return;
        }

        // Normal case: Reverse the string
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);

    }
}
