import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class StudentTeacherHub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        ArrayList<Graduate> allTeachers = new ArrayList<>();
        ArrayList<Graduate> allStudents = new ArrayList<>();

        // Pre-save TomGreen
        Graduate tom = new Graduate("TomGreen", "Male", 25);
        tom.setFee(4500);
        tom.setPay(3200);
        allTeachers.add(tom);
        allStudents.add(tom);

        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add New Teacher");
            System.out.println("2. Add New Student");
            System.out.println("3. View All Teachers Info");
            System.out.println("4. View All Students Info");
            System.out.println("5. View TomGreen's Dual Role Info");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.println("\n--- Add New Teacher ---");
                        
                        System.out.print("Name: ");
                        String tName = scanner.nextLine();

                        String tSex;
                        do {
                            System.out.print("Sex (Male/Female): ");
                            tSex = scanner.nextLine().trim(); 
                            if (!tSex.equals("Male") && !tSex.equals("Female")) {
                                System.out.println("Error: Please enter 'Male' or 'Female' only.");
                            }
                        } while (!tSex.equals("Male") && !tSex.equals("Female")); 
                        System.out.print("Age: ");
                        int tAge = scanner.nextInt();

                        System.out.print("Monthly Salary: ");
                        float tSalary = scanner.nextFloat();

                        Graduate newTeacher = new Graduate(tName, tSex, tAge);
                        newTeacher.setPay(tSalary);
                        allTeachers.add(newTeacher);

                        System.out.println("\nTeacher added! Total teachers: " + allTeachers.size());
                        break;

                    case 2:
                        System.out.println("\n--- Add New Student ---");
                        
                        System.out.print("Name: ");
                        String sName = scanner.nextLine();

                        String sSex;
                        do {
                            System.out.print("Sex (Male/Female only): ");
                            sSex = scanner.nextLine().trim();
                            if (!sSex.equals("Male") && !sSex.equals("Female")) {
                                System.out.println("Error: Please enter 'Male' or 'Female' only.");
                            }
                        } while (!sSex.equals("Male") && !sSex.equals("Female")); 

                        System.out.print("Age: ");
                        int sAge = scanner.nextInt();

                        System.out.print("Tuition per Semester: ");
                        float sFee = scanner.nextFloat();

                        Graduate newStudent = new Graduate(sName, sSex, sAge);
                        newStudent.setFee(sFee);
                        allStudents.add(newStudent);

                        System.out.println("\nStudent added! Total students: " + allStudents.size());
                        break;

                    case 3:
                        System.out.println("\n--- All Teachers Info ---");
                        if (allTeachers.isEmpty()) {
                            System.out.println("No teachers added yet.");
                        } else {
                            for (int i = 0; i < allTeachers.size(); i++) {
                                Graduate teacher = allTeachers.get(i);
                                System.out.println("\nTeacher " + (i + 1) + ":");
                                System.out.println("Name: " + teacher.getName());
                                System.out.println("Sex: " + teacher.getSex());
                                System.out.println("Age: " + teacher.getAge());
                                System.out.println("Monthly Salary: " + teacher.getPay() + " yuan");
                            }
                        }
                        break;

                    case 4:
                        System.out.println("\n--- All Students Info ---");
                        if (allStudents.isEmpty()) {
                            System.out.println("No students added yet.");
                        } else {
                            for (int i = 0; i < allStudents.size(); i++) {
                                Graduate student = allStudents.get(i);
                                System.out.println("\nStudent " + (i + 1) + ":");
                                System.out.println("Name: " + student.getName());
                                System.out.println("Sex: " + student.getSex());
                                System.out.println("Age: " + student.getAge());
                                System.out.println("Tuition per Semester: " + student.getFee() + " yuan");
                            }
                        }
                        break;

                    case 5:
                        System.out.println("\n--- TomGreen's Dual Role Info ---");
                        System.out.println("Name: " + tom.getName());
                        System.out.println("Sex: " + tom.getSex());
                        System.out.println("Age: " + tom.getAge());
                        System.out.println("Student Role: Tuition = " + tom.getFee() + " yuan/semester");
                        System.out.println("Teacher Role: Salary = " + tom.getPay() + " yuan/month");
                        System.out.println("Annual Income (2450 Monthly): " + tom.f() + " yuan");
                        System.out.println(tom.f() < 2000 ? "Status: Needs Loan" : "Status: No Loan Needed");
                        break;

                    case 6:
                        System.out.println("Exiting. Goodbye!");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid option. Choose 1-6.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Enter numbers for age/salary/fee!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}