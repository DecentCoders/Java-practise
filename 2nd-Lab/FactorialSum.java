public class FactorialSum {
    public static void main(String[] args) {
        long totalSum = 0;
        for (int i = 1; i <= 15; i++) {
            totalSum += factorial(i);
        } 
        System.out.println("1! + 2! + ... + 15! = " + totalSum);
    }
    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
    