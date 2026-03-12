package Oct.Chapter18_CollectionFramework.Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class LISTIETRATOR {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add("Sneha");

        ListIterator<String> li = names.listIterator();

        System.out.println("Forward Traversal:");

        while(li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("Backward Traversal:");

        while(li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
