public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, String programmingLanguage) {
        super(name, age); 
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println("Position: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("-------------------------");
    }
}