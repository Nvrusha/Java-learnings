package Oct.Ex18_CollectionFramework.List.Stack;

import java.util.Stack;

public class Example {
    public static void main(String[] args) {

        // Create a Stack
        Stack<String> stack = new Stack<>();

        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Sugar-apple");

        // Print the stack
        System.out.println("Stack: " + stack);

        // Peek the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element from the stack
        System.out.println("Popped: " + stack.pop());

        // Print the stack after popping
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
