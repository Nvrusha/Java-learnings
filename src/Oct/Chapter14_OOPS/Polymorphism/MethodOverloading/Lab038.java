package Oct.Chapter14_OOPS.Polymorphism.MethodOverloading;

public class Lab038 {
    public static void main(String[] args) {
        //Definition:
        //This occurs when two or more methods in the same class have the same name but different
        //parameter lists. The method to be invoked is determined at compile-time.

        Calculator calc = new Calculator();
        System.out.println(calc.add(4,7));         // Calls add(int, int)
        System.out.println(calc.add(4.5,7.8));      // Calls add(double, double)
        System.out.println(calc.add(12,45,2));  // Calls add(int, int, int)
    }
}

class Calculator{
    //Overloaded methods can have different return types but must differ in parameters.

    int add (int a,int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}