public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
    }
}