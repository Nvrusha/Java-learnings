package Oct.Ex8_Taking_Input;

import java.util.Scanner;

public class Task16_Oct {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a > b ? "The maximum number is:" + a: "The maximum number is:" + b);
    }
}
