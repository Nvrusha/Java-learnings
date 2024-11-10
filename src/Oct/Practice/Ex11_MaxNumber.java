package Oct.Practice;

public class Ex11_MaxNumber {
    public static void main(String[] args) {
        // Find maximum number in an array

        int [] array = {1,7,4,90,23,54,23,89,11};

        int max = 0;

        for (int i = 0; i < array.length-1; i++ ){
            if(array[i] > array[i+1]){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
