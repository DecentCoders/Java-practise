public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}