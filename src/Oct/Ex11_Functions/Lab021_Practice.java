package Oct.Ex11_Functions;

public class Lab021_Practice {
    public static void main(String[] args) {
        //1
        greet();

        //2
        int temp = getTemperature();
        System.out.println(temp);

        //3
        greetByName("Vrushali");

        //4
        int res = sum(30,789);
        System.out.println(res);
    }
    // 1. Without Parameters and Without Return Type.
    static void greet(){
        System.out.println("Hi there!");
    }

    // 2.Without Parameters but With Return Type
     static int getTemperature() {
         System.out.println("Hi I am 2nd type");
        return 25;
    }

    // 3. With Parameters and Without Return Type
    static void greetByName(String name){
        System.out.println("Hello " + name);
    }

    // 4. With Parameters and With Return Type
    static int sum(int a ,int b){
        return a + b;
    }
}
