package Oct.Chapter11_Functions;

public class Lab020_Notes {
    public static void main(String[] args) {
        //In Java, a function (more commonly referred to as a "method") is a block of code
        //designed to perform a specific task. Functions are used to organize and reuse code,
        //making programs more modular, readable, and maintainable.
        //Here are some key points about functions in Java:

        //1. Structure of a Function

        //A typical function in Java consists of:

        //1.Return type: Specifies the type of value the function will return (e.g., int, String, void if no value is returned).
        //2.Name: The function's name, which follows Java's naming conventions.
        //3.Parameters: Optional inputs that the function can accept (enclosed in parentheses).
        //4.Body: The code within {} that defines what the function does.

        //public int add(int a, int b) {
        //    return a + b;
        //}

        //In this example:

        //The function name is add.
        //It takes two parameters, a and b, both of type int.
        //It returns an int value that is the sum of a and b.

        //2. Types of Functions

        //Predefined Functions: These are functions provided by Java libraries (e.g., System.out.println()).
        //User-Defined Functions: These are functions created by the programmer to perform specific tasks.

        //3. Static vs. Instance Functions

        //Static Methods: Defined with the static keyword, these belong to the class and can be called without creating an object of the class.
        //Instance Methods: These do not have the static keyword and must be called on an instance of the class.

        //public class Example {
        //    // Static method
        //    public static void staticMethod() {
        //        System.out.println("Static method called.");
        //    }

        //    // Instance method
        //    public void instanceMethod() {
        //        System.out.println("Instance method called.");
        //    }
        //}

        //4. Function Overloading

        //Java allows you to define multiple functions with the same name but different parameters.
        //This is known as function overloading.

        //public int multiply(int a, int b) {
        //    return a * b;
        //}
        //
        //public double multiply(double a, double b) {
        //    return a * b;
        //}

        //5. Return Statement
        //A function can return a value using the return keyword. If the function's return type is void, it means no value will be returned.

        //public String greet(String name) {
        //    return "Hello, " + name;
        //}

        //6. Calling a Function
        //To use a function, you call it by its name and pass any required arguments.

        //Example example = new Example();
        //example.instanceMethod();      // Calls the instance method
        //Example.staticMethod();        // Calls the static method
        //Functions (or methods) in Java help keep code organized, efficient, and modular. They are essential for breaking down complex tasks into smaller, manageable parts.
    }
}
