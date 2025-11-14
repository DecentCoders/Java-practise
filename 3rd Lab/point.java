public class point{
    protected double x;
    protected double y;
    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void displayPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        point p1 = new point(3.5, 7.2);
        p1.displayPoint();
        p1.setX(10.0);
        p1.setY(15.0);
        System.out.println("Updated point: (" + p1.getX() + ", " + p1.getY() + ")");
    }
}