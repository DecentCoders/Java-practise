import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countNumberOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();
        
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1); 
        }
        
        if (countMap.isEmpty()) {
            System.out.println("Warning: The input is an empty string.");
        } else {
            System.out.println("the number of each character:"); 
            for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
                System.out.println("■ " + entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}