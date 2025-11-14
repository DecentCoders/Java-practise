public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("Position: Manager");
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}