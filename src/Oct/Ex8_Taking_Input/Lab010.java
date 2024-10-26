package Oct.Ex8_Taking_Input;

public class Lab010 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        String res = (age > 25)? "Can drive car": "Can't drive car";
        System.out.println(res);
    }
}
