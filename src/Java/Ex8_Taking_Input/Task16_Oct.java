package Java.Ex8_Taking_Input;

public class Task16_Oct {
    public static void main(String[] args) {

        // Find the maximum number

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a > b ? "The maximum number is:" + a: "The maximum number is:" + b);
    }
}
