package Oct.Chapter18_CollectionFramework.List;

public class List_Notes {
    public static void main(String[] args) {

        /*
         ===========================================================
                        JAVA LIST – INTERVIEW REVISION NOTES
         ===========================================================

         📌 1) WHAT IS A LIST?
         -----------------------------------------------------------
         List is an ordered collection that allows duplicates
         and supports index-based access.

         • Maintains insertion order
         • Allows duplicate elements
         • Allows multiple null values
         • Position (index) matters

         Example:
         [Milk, Bread, Milk] ✔ allowed

         Real use:
         Cart items, playlist, transaction history

         Interview Definition:
         "List is an ordered collection that allows duplicates
         and provides positional access to elements."


         📌 2) LIST HIERARCHY
         -----------------------------------------------------------
         Collection
            |
            |-- List (interface)
                  |
                  |-- ArrayList
                  |-- LinkedList
                  |-- Vector
                         |
                         |-- Stack


         📌 3) DIFFERENCE BETWEEN IMPLEMENTATIONS
         -----------------------------------------------------------
         ArrayList
         - Dynamic array
         - Fast random access O(1)
         - Slow insert/delete middle O(n)
         - Most used

         LinkedList
         - Doubly linked list
         - Fast insertion/deletion
         - Slow access O(n)

         Vector
         - Thread safe (synchronized)
         - Slow → legacy class


         📌 4) HOW ARRAYLIST WORKS INTERNALLY
         -----------------------------------------------------------
         Uses resizable array

         Default capacity = 10

         When full:
         newCapacity = oldCapacity + oldCapacity/2
         (1.5x growth)

         Old array copied to new bigger array

         Important Interview Line:
         "ArrayList internally uses dynamic resizing array."


         📌 5) IMPORTANT METHODS
         -----------------------------------------------------------

         // add element
         list.add(e);

         // add at index
         list.add(index, e);

         // get element
         list.get(index);

         // update element
         list.set(index, value);

         // remove element
         list.remove(index);
         list.remove(object);

         // search
         list.contains(obj);
         list.indexOf(obj);

         // size
         list.size();

         // empty check
         list.isEmpty();

         // remove all
         list.clear();


         📌 6) ITERATION TECHNIQUES
         -----------------------------------------------------------

         // for loop (fastest for ArrayList)
         for(int i=0;i<list.size();i++)

         // for-each
         for(E e : list)

         // iterator
         Iterator<E> it = list.iterator();

         // bidirectional traversal
         ListIterator<E> li = list.listIterator();


         📌 7) TIME COMPLEXITY
         -----------------------------------------------------------
         Operation        ArrayList     LinkedList
         get()            O(1)          O(n)
         add(end)         O(1)          O(1)
         add(middle)      O(n)          O(n)
         remove()         O(n)          O(n)


         📌 8) COMMON INTERVIEW PROGRAMS USING LIST
         -----------------------------------------------------------
         • Reverse list
         • Remove duplicates
         • Find second largest
         • Rotate list
         • Merge lists
         • Sublist extraction


         📌 9) IMPORTANT INTERVIEW QUESTIONS
         -----------------------------------------------------------

         Q: ArrayList vs LinkedList?
         A: ArrayList fast access, LinkedList fast modification

         Q: Array vs ArrayList?
         A: Array fixed size, ArrayList dynamic

         Q: Why LinkedList faster insertion?
         A: No shifting required

         Q: Does List allow null?
         A: Yes


         📌 10) AUTOMATION TESTING USAGE
         -----------------------------------------------------------

         Store UI elements
         List<WebElement> elements = driver.findElements(...);

         Convert to text
         elements.stream().map(WebElement::getText).toList();

         Order validation
         Compare expected vs actual sequence


         📌 11) COMMON TRAPS
         -----------------------------------------------------------

         Arrays.asList() creates fixed size list
         list.add() → UnsupportedOperationException

         Convert List ↔ Set
         new HashSet<>(list)
         new ArrayList<>(set)


         📌 12) WHEN TO USE WHICH
         -----------------------------------------------------------
         ArrayList  → Frequent reading
         LinkedList → Frequent insertion/deletion
         Vector     → Legacy multi-threaded


         📌 FINAL INTERVIEW ONE-LINER
         -----------------------------------------------------------
         "ArrayList is preferred for fast access and LinkedList
         when frequent modifications are required."

         ===========================================================
         END OF LIST REVISION
         ===========================================================
        */

    }
}
