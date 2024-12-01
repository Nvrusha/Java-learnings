package Oct.Ex14_OOPS.Super_Keyword;

public class Lab041 {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

class A{
    // Default constructor
    public A(){
        System.out.println("A is called");
    }

    //Parameterized constructor
    public A(int num){
        System.out.println("A PC is called");
    }
}

class B extends A{
    // Default constructor
    public B(){
        System.out.println("B is called");
    }

    //Parameterized constructor
    public B(int num){
        System.out.println("B PC is called");
    }
}
