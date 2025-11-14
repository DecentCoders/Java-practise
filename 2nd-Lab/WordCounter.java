import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[10];
        System.out.println("Please enter 10 English words (no numbers or spaces allowed):");
        for (int i = 0; i < 10; i++) {
            boolean isValid;
            do {
                System.out.print("Word " + (i + 1) + ": ");
                String word = input.nextLine().trim(); 
                if (word.isBlank()) {
                    System.out.println("Error: Spaces or empty input are not allowed. Please re-enter.");
                    isValid = false;
                }
                else if (!word.matches("^[A-Za-z]+$")) {
                    System.out.println("Error: Numbers and spaces are not allowed. Please re-enter.");
                    isValid = false;
                }
                else {
                    words[i] = word;
                    isValid = true;
                }
            } while (!isValid); 
        }
        int startWithW = 0;
        int hasOr = 0;
        int length5 = 0;    
        for (String word : words) {
            if (word.startsWith("W")) startWithW++;
            if (word.contains("or")) hasOr++;
            if (word.length() == 5) length5++;
        }
        System.out.println("\nStatistics:");
        System.out.println("1. Words starting with 'W': " + startWithW);
        System.out.println("2. Words containing \"or\": " + hasOr);
        System.out.println("3. Words with length 5: " + length5);
        
        input.close();
    }
}
