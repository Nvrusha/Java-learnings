package Oct.Ex7_Operators;

public class Task11_Oct {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 90;
        int b = 20;

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int modulo = a % b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);
        System.out.println(modulo);

        // 2. Relational (Comparison) Operators

        boolean isEqual = (5 == 3); // isEqual = false
        boolean isNotEqual = (5 != 3); // isNotEqual = true
        boolean isGreater = (5 > 3); // isGreater = true
        boolean isLesser = (5 < 3); // isLesser = false
        boolean isGreaterOrEqual = (5 >= 5); // isGreaterOrEqual = true
        boolean isLesserOrEqual = (5 <= 3); // isLesserOrEqual = false

        // 3. Logical Operators

        boolean result1 = (5 > 3) && (3 > 1); // result1 = true
        boolean result2 = (5 > 3) || (3 > 1); // result2 = true
        boolean result3 = !(5 > 3); // result3 = false

        // 4. Conditional (Ternary) Operator

        int A = 20;
        int B = 300;
        int C = 80;

        String result = A > B ? "A is greater than B" : B > C ? "B is greater than C": "C is greater than B" ;
        System.out.println(result);
    }
}
