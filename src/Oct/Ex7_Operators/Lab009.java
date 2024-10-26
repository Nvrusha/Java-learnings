package Oct.Ex7_Operators;

public class Lab009 {
    public static void main(String[] args) {
//        1. Arithmetic Operators
//        + : Addition
//                - : Subtraction
//                * : Multiplication
//                / : Division
//                % : Modulus (remainder)

//        2. Unary Operators
//                 + : Unary plus (positive)
//                 - : Unary minus (negative)
//                ++ : Increment (pre-increment/post-increment)
//                -- : Decrement (pre-decrement/post-decrement)
//                 ! : Logical NOT

//        3. Relational (Comparison) Operators
//                == : Equal to
//                != : Not equal to
//                > : Greater than
//                < : Less than
//                >= : Greater than or equal to
//                <= : Less than or equal to

//        4. Logical Operators
//                && : Logical AND
//                || : Logical OR
//                 ! : Logical NOT

//        5. Bitwise Operators
//                 & : Bitwise AND
//                 | : Bitwise OR
//                 ^ : Bitwise XOR

//        ~ : Bitwise complement
//                << : Left shift
//                >> : Right shift
//               >>> : Unsigned right shift

//        6. Assignment Operators
//                 = : Simple assignment
//                += : Add and assign
//                -= : Subtract and assign
//                *= : Multiply and assign
//                /= : Divide and assign
//                %= : Modulus and assign
//                &= : Bitwise AND and assign
//                |= : Bitwise OR and assign
//                ^= : Bitwise XOR and assign
//               <<= : Left shift and assign
//               >>= : Right shift and assign
//              >>>= : Unsigned right shift and assign

//        7. Conditional (Ternary) Operator
//                ?: : condition ? trueExpression : falseExpression

//        8. Instanceof Operator
//        instanceof : Checks if an object is an instance of a class.

//        9. Type Casting Operators
//                (type) : Used to convert one type into another.

//        10. String Concatenation Operator
//                + : Also used for concatenating strings.

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
