public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("*  |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.print("----|");
        for (int i = 1; i <= 9; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int row = 1; row <= 9; row++) {
            System.out.printf("%2d |", row);  
            for (int col = 1; col <= row; col++) {
                System.out.printf("%4d", row * col); 
            }
            System.out.println();
        }
    }
}
    