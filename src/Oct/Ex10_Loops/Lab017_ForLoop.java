package Oct.Ex10_Loops;

public class Lab017_ForLoop {
    public static void main(String[] args) {
        // 1. Int data type
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // 2. Double data type
        for (double i = 0.0; i < 1.0; i += 0.1) {
            System.out.printf("Value: %.1f%n", i);
        }

        // 3. Character Data Type
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("Character: " + c);
        }
    }
}

