package Oct.Ex15_WrapperClasses;

public class Notes {
    public static void main(String[] args) {

        //  Wrapper Classes in Java
        //  -----------------------
        //  Wrapper classes are part of the java.lang package.
        //  They provide object representations for primitive data types.
        // Wrapper classes are used to convert primitive data types into objects and vice versa.

        //  Primitive Types and Their Wrapper Classes
        //  byte     -> Byte
        //  short    -> Short
        //  int      -> Integer
        //  long     -> Long
        //  float    -> Float
        //  double   -> Double
        //  char     -> Character
        //  boolean  -> Boolean

        //  Key Features

        //  1. Autoboxing: Automatic conversion of a primitive to its corresponding wrapper object.
        //     Example: int num = 10; Integer obj = num; // Autoboxing

        //  2. Unboxing: Automatic conversion of a wrapper object back to its corresponding primitive.
        //     Example: Integer obj = 10; int num = obj; // Unboxing

        //  Commonly Used Methods in Wrapper Classes

        //  1. valueOf(): Converts a primitive or string to a wrapper object.
        //     Example: Integer obj = Integer.valueOf(10);

        //  2. parseXxx(String): Converts a string to a primitive type.
        //     Example: int num = Integer.parseInt("123");

        //  3. xxxValue(): Converts a wrapper object to a primitive type.
        //     Example: int num = obj.intValue();

        //  4. toString(): Converts a wrapper object or primitive to a string.
        //     Example: String str = Integer.toString(123);

        //  Advantages of Wrapper Classes

        //  1. Collections support: Collections (e.g., ArrayList, HashMap) require objects, not primitives.
        //  2. Utility methods: Provide methods for parsing, conversion, and type handling.
        //  3. Null support: Wrapper objects can be null, whereas primitives cannot.

        //  Points to Note

        //  1. Wrapper objects are immutable, meaning their values cannot change after creation.
        //  2. Autoboxing/unboxing introduces overhead, so use primitives in performance-critical code.


    }
}
