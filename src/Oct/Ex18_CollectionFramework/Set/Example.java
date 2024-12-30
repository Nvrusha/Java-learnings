package Oct.Ex18_CollectionFramework.Set;

import java.util.HashSet;

public class Example {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add("Vrushali");
        hashSet.add("Vrushali");
        hashSet.add(null);

        System.out.println(hashSet);
    }
}
