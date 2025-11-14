public class Graduate implements StudentInterface, TeacherInterface {
    private String name;
    private String sex;
    private int age;
    private float fee; 
    private float pay; 

    public Graduate(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public String getSex() { return sex; }
    public int getAge() { return age; }

    @Override
    public void setFee(float fee) { this.fee = fee; }
    @Override
    public float getFee() { return fee; }

    @Override
    public void setPay(float pay) { this.pay = pay; }
    @Override
    public float getPay() { return pay; }

    public float f() {
        return (pay * 12) - (fee * 2); // 12 months salary - 2 semesters tuition
    }
}