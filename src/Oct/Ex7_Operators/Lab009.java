package Oct.Ex7_Operators;

public class Lab009 {
    public static void main(String[] args) {
        System.out.println("You answer is " + 10%12);

        // Ternary operator
        int a = 20;
        int b = 300;
        int c = 80;

        String result = a > b ? "A is greater than B" : (b > c ? "B is greater than C": "C is greater than B");
        System.out.println(result);

//        System.out.println(++a + a++ + a++);
//        System.out.println(--a + a++ + a--);


    }
}
