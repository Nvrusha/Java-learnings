package Oct.Ex8_Taking_Input;

public class Lab010_Arguments_console {
    public static void main(String[] args) {

        // args is an array of String that stores each argument passed from the command
        // line. You can access each argument using array indexing (args[0], args[1], etc.).

        int age = Integer.parseInt(args[1]);

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

        String res = (age > 25)? "Can drive car": "Can't drive car";
        System.out.println(res);
    }
}
