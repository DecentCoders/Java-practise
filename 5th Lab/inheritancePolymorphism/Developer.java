public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Specialized in: " + programmingLanguage);
    }
}