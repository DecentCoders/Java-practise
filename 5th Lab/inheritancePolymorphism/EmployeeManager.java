import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private static final List<Employee> generalEmployees = new ArrayList<>();
    private static final List<Manager> managers = new ArrayList<>();
    private static final List<Developer> developers = new ArrayList<>();

    static {
        generalEmployees.add(new Employee("Emily Davis", 65000));
        generalEmployees.add(new Employee("James Wilson", 72000));

        managers.add(new Manager("Michael Brown", 95000, "IT"));
        managers.add(new Manager("Sarah Johnson", 105000, "Finance"));

        developers.add(new Developer("Sophia Lee", 85000, "Java"));
        developers.add(new Developer("Liam Garcia", 90000, "Python"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Employee Manager!");
        System.out.println("Manage and view employee details:\n");

        do {
            System.out.println("1. View General Employees");
            System.out.println("2. View Managers");
            System.out.println("3. View Developers");
            System.out.println("4. Add New Employee");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice (1-5): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input! Enter a number (1-5): ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    displayGeneralEmployees();
                    break;
                case 2:
                    displayManagers();
                    break;
                case 3:
                    displayDevelopers();
                    break;
                case 4:
                    addNewEmployee(scanner); 
                    break;
                case 5:
                    System.out.println("\nGoodbye....! ");
                    break;
                default:
                    System.out.println("Invalid choice! Enter 1-5.\n");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static void displayGeneralEmployees() {
        System.out.println("\n--- General Employees ---");
        if (generalEmployees.isEmpty()) {
            System.out.println("No general employees found.\n");
            return;
        }
        for (int i = 0; i < generalEmployees.size(); i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            generalEmployees.get(i).printDetails();
        }
        System.out.println("\n-------------------------\n");
    }

    private static void displayManagers() {
        System.out.println("\n--- Managers ---");
        if (managers.isEmpty()) {
            System.out.println("No managers found.\n");
            return;
        }
        for (int i = 0; i < managers.size(); i++) {
            System.out.println("\nManager " + (i + 1) + ":");
            managers.get(i).printDetails();
        }
        System.out.println("\n-------------------------\n");
    }

    private static void displayDevelopers() {
        System.out.println("\n--- Developers ---");
        if (developers.isEmpty()) {
            System.out.println("No developers found.\n");
            return;
        }
        for (int i = 0; i < developers.size(); i++) {
            System.out.println("\nDeveloper " + (i + 1) + ":");
            developers.get(i).printDetails();
        }
        System.out.println("\n-------------------------\n");
    }
    private static void addNewEmployee(Scanner scanner) {
        System.out.println("\n--- Add New Employee ---");
        System.out.println("What is the employee's role?");
        System.out.print(" 'general', 'manager', or 'developer': ");

        String role;
        while (true) {
            role = scanner.nextLine().trim().toLowerCase();
            if (role.equals("general") || role.equals("manager") || role.equals("developer")) {
                break;
            }
            System.out.print("Invalid role! Enter 'general', 'manager', or 'developer': ");
        }

        System.out.print("Enter employee's name: ");
        String name = getNonEmptyInput(scanner, "Name cannot be empty! Try again: ");

        double salary = getValidSalary(scanner);
        switch (role) {
            case "general":
                generalEmployees.add(new Employee(name, salary));
                System.out.println("\n Successfully added general employee: " + name);
                break;
            case "manager":
                System.out.print("Enter department (e.g., IT, Finance): ");
                String department = getNonEmptyInput(scanner, "Department cannot be empty! Try again: ");
                managers.add(new Manager(name, salary, department));
                System.out.println("\n Successfully added manager: " + name);
                break;
            case "developer":
                System.out.print("Enter programming language (e.g., Java, Python): ");
                String language = getNonEmptyInput(scanner, "Language cannot be empty! Try again: ");
                developers.add(new Developer(name, salary, language));
                System.out.println("\n Successfully added developer: " + name);
                break;
        }

        System.out.println("-------------------------\n");
    }
    private static String getNonEmptyInput(Scanner scanner, String errorMessage) {
        String input;
        do {
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.print(errorMessage);
            }
        } while (input.isEmpty());
        return input;
    }
    private static double getValidSalary(Scanner scanner) {
        double salary;
        while (true) {
            System.out.print("Enter salary (must be positive): $");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                scanner.nextLine(); 
                if (salary > 0) {
                    break;
                } else {
                    System.out.println("Salary must be greater than 0.");
                }
            } else {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
            }
        }
        return salary;
    }
}