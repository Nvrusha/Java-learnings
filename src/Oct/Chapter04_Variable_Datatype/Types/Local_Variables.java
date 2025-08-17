package Oct.Chapter04_Variable_Datatype.Types;

public class Local_Variables {
    public static void main(String[] args) {

        //Declared inside a method, constructor, or block.
        //Scope: Limited to the method, constructor, or block in which they are defined.
        //Must be initialized before use.
        //Not accessible outside their scope.
        //Memory: Stored in the stack.

        int num = 10; // Local variable
        System.out.println("Local variable: " + num);
    }
}
