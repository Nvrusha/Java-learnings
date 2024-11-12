package Oct.Ex10_Loops;

public class Lab016_Notes {
    public static void main(String[] args) {

        //1. for Loop 🔄

        //The for loop is commonly used when you know the exact number of times you want to
        //repeat a task. It consists of three parts: initialization, condition, and increment/decrement.

        //Syntax:
        //for (initialization; condition; increment/decrement) {
        // Code to be executed
        //}
        //Example:
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        //Initialization happens once at the beginning of the loop.
        //Condition is checked before each iteration, and the loop continues as long as it’s true.
        //Increment/Decrement happens after each iteration.

        //2. while Loop ♻️

        //The while loop is used when you want to repeat code as long as a certain condition
        //is true, but you don’t necessarily know the number of iterations in advance.

        //Syntax:
        //while (condition) {
        //    // Code to be executed
        //}
        //Example:
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }
        //The condition is checked before each iteration.
        //If the condition is false at the start, the loop doesn’t execute at all.

        //3. do-while Loop 🔂

        //The do-while loop is similar to the while loop, but it guarantees that the code block
        //runs at least once. The condition is checked after each iteration.

        //Syntax:

        //do {
        //    // Code to be executed
        //} while (condition);
        //Example:
        int count1 = 0;
        do {
            System.out.println("Count: " + count1);
            count1++;
        } while (count1 < 5);
        //Since the condition is checked at the end, the code runs at least once, regardless of the
        //condition.

        //4. Enhanced for Loop (For-Each Loop) 🔄📦

        //Introduced in Java 5, the enhanced for loop (or foreach loop) is designed for iterating
        //over arrays or collections, making code shorter and more readable.

        //Syntax:

        //for (Type item : collection) {
        //    // Code to execute
        //}

        //Example:
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }
        //This loop doesn’t use an index, so it’s not ideal if you need to modify elements directly or
        //need the index.

        //5. break and continue Statements 🚧

        //break: Immediately exits the loop, skipping any remaining code inside the loop block.
        //continue: Skips the current iteration and moves to the next iteration of the loop.

    }
}
