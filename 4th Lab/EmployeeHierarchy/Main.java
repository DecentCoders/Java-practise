import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>(); // Store all employees
        boolean running = true;

        System.out.println("=== Employee Management System ===");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a Manager");
            System.out.println("2. Add a Developer");
            System.out.println("3. View All Employees");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                switch (choice) {
                    case 1:
                        addManager(scanner, employees);
                        break;
                    case 2:
                        addDeveloper(scanner, employees);
                        break;
                    case 3:
                        viewAllEmployees(employees);
                        break;
                    case 4:
                        running = false;
                        System.out.println("Exiting... Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Enter 1-4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Oops! Please enter a number (1-4).");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
    private static void addManager(Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("\n--- Add New Manager ---");
        
        System.out.print("Enter manager's name: ");
        String name = scanner.nextLine();

        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            try {
                System.out.print("Enter manager's age: ");
                age = scanner.nextInt();
                scanner.nextLine(); 
                validAge = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid age! Please enter a number.");
                scanner.nextLine(); 
            }
        }

        System.out.print("Enter department (e.g., Sales, IT): ");
        String department = scanner.nextLine();
        employees.add(new Manager(name, age, department));
        System.out.println("Manager added successfully!");
    }
    private static void addDeveloper(Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("\n--- Add New Developer ---");
        
        System.out.print("Enter developer's name: ");
        String name = scanner.nextLine();

        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            try {
                System.out.print("Enter developer's age: ");
                age = scanner.nextInt();
                scanner.nextLine(); 
                validAge = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid age! Please enter a number.");
                scanner.nextLine(); 
            }
        }

        System.out.print("Enter programming language (e.g., Java, Python): ");
        String language = scanner.nextLine();
        employees.add(new Developer(name, age, language));
        System.out.println("Developer added successfully!");
    }
    private static void viewAllEmployees(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("\nNo employees to display. Add some first!");
            return;
        }

        System.out.println("\n--- All Employees ---");
        for (Employee emp : employees) {
            emp.showInfo(); 
        }
    }
}