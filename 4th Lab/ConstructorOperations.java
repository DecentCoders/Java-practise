import java.util.Scanner;
import java.util.InputMismatchException;

public class ConstructorOperations {
    private int maxInt;         
    private double productDouble; 
    private boolean areStringsEqual;

    public ConstructorOperations(int a, int b) {
        this.maxInt = Math.max(a, b);
    }

    public ConstructorOperations(double x, double y, double z) {
        this.productDouble = x * y * z;
    }

    public ConstructorOperations(String s1, String s2) {
        s1 = "null".equals(s1) ? null : s1;
        s2 = "null".equals(s2) ? null : s2;
        this.areStringsEqual = (s1 == null) ? (s2 == null) : s1.equals(s2);
    }

    // Getters to access results
    public int getMaxInt() {
        return maxInt;
    }

    public double getProductDouble() {
        return productDouble;
    }

    public boolean getAreStringsEqual() {
        return areStringsEqual;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Choose an operation (or 0 to exit):");

        while (running) {
            System.out.println("\n1. Find the larger of two integers");
            System.out.println("2. Calculate product of three doubles");
            System.out.println("3. Check if two strings are identical");
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
                        ConstructorOperations op1 = new ConstructorOperations(num1, num2);
                        System.out.println("Result: The larger number is " + op1.getMaxInt());
                        break;

                    case 2: 
                        System.out.print("Enter first double (e.g., 2.5): ");
                        double d1 = scanner.nextDouble();
                        System.out.print("Enter second double: ");
                        double d2 = scanner.nextDouble();
                        System.out.print("Enter third double: ");
                        double d3 = scanner.nextDouble();
                        ConstructorOperations op2 = new ConstructorOperations(d1, d2, d3);
                        System.out.println("Result: Product = " + op2.getProductDouble());
                        break;

                    case 3: 
                        System.out.println("Enter two strings (type 'null' for null values):");
                        System.out.print("First string: ");
                        String s1 = scanner.nextLine();
                        System.out.print("Second string: ");
                        String s2 = scanner.nextLine();
                        ConstructorOperations op3 = new ConstructorOperations(s1, s2);
                        System.out.println("Result: Strings are " + (op3.getAreStringsEqual() ? "identical" : "different"));
                        break;

                    case 0: 
                        running = false;
                        System.out.println("Exiting... Thanks!");
                        break;

                    default:
                        System.out.println("Invalid choice. Enter 0-3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Oops! Please enter the correct type of value.");
                scanner.nextLine(); 
            }
        }

        scanner.close();
    }
}