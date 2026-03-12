package Oct.Chapter18_CollectionFramework.Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class ENUMERATION {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        // Creating Enumeration cursor
        Enumeration<String> e = fruits.elements();

        System.out.println("Printing elements using Enumeration:");

        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
