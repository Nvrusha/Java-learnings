package Oct.Chapter07_Operators;

public class Task15_Oct {
    public static void main(String[] args) {

        //  Largest of Three Numbers a,b,c using the Ternary Operator.

        int a = 500;
        int b = 300;
        int c = 800;

        String result = (a > b && a > c) ? "A is the greatest" : (b > c) ? "B is the greatest":
                "C is the greatest" ;
        System.out.println(result);
    }
}
