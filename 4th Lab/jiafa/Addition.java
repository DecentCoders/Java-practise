package jiafa;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Addition {
    public int add(int a, int b) {
        return a + b;
    }

    public long add(long a, long b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition calculator = new Addition();
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Interactive Addition Tool ===");
        System.out.println("Choose what to add (enter a number):");

        // Loop to keep the program running until user exits
        while (keepRunning) {
            // Show menu
            System.out.println("\n1. Add two integers (e.g., 5 + 3)");
            System.out.println("2. Add two large integers (long, e.g., 1000000000 + 2000000000)");
            System.out.println("3. Add two decimal numbers (float, e.g., 3.14 + 2.71)");
            System.out.println("4. Add two precise decimals (double, e.g., 1.2345 + 6.7890)");
            System.out.println("5. Combine two strings (e.g., \"Hello\" + \"World\")");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                switch (choice) {
                    case 1:
                        System.out.print("Enter first integer: ");
                        int num1 = scanner.nextInt();
                        System.out.print("Enter second integer: ");
                        int num2 = scanner.nextInt();
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + calculator.add(num1, num2));
                        break;

                    case 2: 
                        System.out.print("Enter first large integer (long): ");
                        long l1 = scanner.nextLong();
                        System.out.print("Enter second large integer (long): ");
                        long l2 = scanner.nextLong();
                        System.out.println("Result: " + l1 + " + " + l2 + " = " + calculator.add(l1, l2));
                        break;

                    case 3: 
                        System.out.print("Enter first decimal (float, e.g., 3.14): ");
                        float f1 = scanner.nextFloat();
                        System.out.print("Enter second decimal (float): ");
                        float f2 = scanner.nextFloat();
                        System.out.println("Result: " + f1 + " + " + f2 + " = " + calculator.add(f1, f2));
                        break;

                    case 4: 
                        System.out.print("Enter first precise decimal (double, e.g., 1.2345): ");
                        double d1 = scanner.nextDouble();
                        System.out.print("Enter second precise decimal (double): ");
                        double d2 = scanner.nextDouble();
                        System.out.println("Result: " + d1 + " + " + d2 + " = " + calculator.add(d1, d2));
                        break;

                    case 5: 
                        System.out.print("Enter first string: ");
                        String s1 = scanner.nextLine(); 
                        System.out.print("Enter second string: ");
                        String s2 = scanner.nextLine();
                        System.out.println("Result: \"" + s1 + "\" + \"" + s2 + "\" = \"" + calculator.add(s1, s2) + "\"");
                        break;

                    case 0:
                        keepRunning = false;
                        System.out.println("Exiting... Thanks for using!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter 0-5.");
                }
            } catch (InputMismatchException e) {
                
                System.out.println("Oops! Please enter the correct type of value.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}