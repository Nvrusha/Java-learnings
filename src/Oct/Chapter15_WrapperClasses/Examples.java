package Oct.Chapter15_WrapperClasses;

public class Examples {
    public static void main(String[] args) {
        // Autoboxing (converting primitive types to their wrapper classes)
        // Unboxing (converting wrapper objects back to primitives)

        // 1. byte
        byte b = 10;                   // Primitive
        Byte byteObj = b;              // Autoboxing
        byte bUnboxed = byteObj;       // Unboxing
        System.out.println("byte: " + bUnboxed);

        // 2. short
        short s = 20;                  // Primitive
        Short shortObj = s;            // Autoboxing
        short sUnboxed = shortObj;     // Unboxing
        System.out.println("short: " + sUnboxed);

        // 3. int
        int i = 30;                    // Primitive
        Integer intObj = i;            // Autoboxing
        int iUnboxed = intObj;         // Unboxing
        System.out.println("int: " + iUnboxed);

        // 4. long
        long l = 40L;                  // Primitive
        Long longObj = l;              // Autoboxing
        long lUnboxed = longObj;       // Unboxing
        System.out.println("long: " + lUnboxed);

        // 5. float
        float f = 50.5f;               // Primitive
        Float floatObj = f;            // Autoboxing
        float fUnboxed = floatObj;     // Unboxing
        System.out.println("float: " + fUnboxed);

        // 6. double
        double d = 60.6;               // Primitive
        Double doubleObj = d;          // Autoboxing
        double dUnboxed = doubleObj;   // Unboxing
        System.out.println("double: " + dUnboxed);

        // 7. char
        char c = 'A';                  // Primitive
        Character charObj = c;         // Autoboxing
        char cUnboxed = charObj;       // Unboxing
        System.out.println("char: " + cUnboxed);

        // 8. boolean
        boolean bool = true;           // Primitive
        Boolean boolObj = bool;        // Autoboxing
        boolean boolUnboxed = boolObj; // Unboxing
        System.out.println("boolean: " + boolUnboxed);

        
    }
}
