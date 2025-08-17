package Oct.Chapter09_Conditionals;

public class Lab015_Switch_new {
    public static void main(String[] args) {

        //several enhancements were made to the switch statement in Java,
        //making it more versatile and expressive.

        //Benefits:
        //1.Reduces verbosity (less need for break statements).
        //2.Allows multiple labels per case (like case 1, 7).
        //3.Provides a single-line, more readable syntax.

        int day = 3;

        String dayType = switch(day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> "Invalid day";
        };

        System.out.println(dayType);
    }
}
