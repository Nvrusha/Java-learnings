package Oct.Ex18_CollectionFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args) {

        // 1. HashSet: Unordered and does not allow duplicates
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicate, ignored
        hashSet.add(null); // Null is allowed
        System.out.println("HashSet: " + hashSet); // Example Output: [null, Apple, Banana]

        // 2. LinkedHashSet: Maintains insertion order and does not allow duplicates
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add(null); // Null is allowed
        System.out.println("LinkedHashSet: " + linkedHashSet); // Example Output: [Apple, Banana, Cherry, null]

        // 3. TreeSet: Maintains elements in sorted order and does not allow null
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10); // Integer value
        treeSet.add(5);
        treeSet.add(20);
        // treeSet.add(null); // Uncommenting this will throw NullPointerException
        System.out.println("TreeSet: " + treeSet); // Output: [5, 10, 20]

        // Additional Example: TreeSet with Strings (sorted alphabetically)
        TreeSet<String> treeSetStrings = new TreeSet<>();
        treeSetStrings.add("Banana");
        treeSetStrings.add("Apple");
        treeSetStrings.add("Cherry");
        System.out.println("TreeSet (Strings): " + treeSetStrings); // Output: [Apple, Banana, Cherry]

        // Observations:
        // HashSet: Unordered, fast for add/remove/search, allows one null
        // LinkedHashSet: Maintains insertion order, allows one null
        // TreeSet: Sorted order, no null allowed, slower due to sorting

        // Demonstrating common Set operations
        System.out.println("HashSet contains 'Apple': " + hashSet.contains("Apple")); // true
        linkedHashSet.remove("Cherry"); // Remove element from LinkedHashSet
        System.out.println("LinkedHashSet after removal: " + linkedHashSet); // [Apple, Banana, null]
        System.out.println("TreeSet size: " + treeSet.size()); // Number of elements in TreeSet
    }
}
