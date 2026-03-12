package Oct.Chapter18_CollectionFramework.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class ITERATOR {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        Iterator<Integer> it = numbers.iterator();

        while(it.hasNext()) {
            int num = it.next();

            System.out.println(num);
        }
    }
}
