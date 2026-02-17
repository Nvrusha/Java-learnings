package Oct.Chapter18_CollectionFramework.Set;

public class Set_Notes {
    public static void main(String[] args) {

          /*
         ===========================================================
                        JAVA SET – INTERVIEW REVISION NOTES
         ===========================================================

         📌 1) WHAT IS A SET?
         -----------------------------------------------------------
         Set is a Collection that stores ONLY UNIQUE elements.

         • Duplicates NOT allowed
         • Not index based
         • Order depends on implementation

         Example:
         [10, 20, 30, 20] → [10, 20, 30]

         Real use:
         Removing duplicates, comparison, validation

         Interview Definition:
         "Set is a collection that stores unique elements and is mainly
         used for searching, comparison and duplicate removal operations."


         📌 2) SET HIERARCHY
         -----------------------------------------------------------
         Collection
            |
            |-- Set (interface)
                  |
                  |-- HashSet
                  |-- LinkedHashSet
                  |-- TreeSet (SortedSet → NavigableSet)


         📌 3) DIFFERENCE BETWEEN SET IMPLEMENTATIONS
         -----------------------------------------------------------
         HashSet
         - Random order
         - Fastest
         - Allows one null
         - O(1)
         - Uses HashMap internally

         LinkedHashSet
         - Maintains insertion order
         - Slightly slower than HashSet
         - Uses Doubly Linked List

         TreeSet
         - Sorted order
         - No null allowed
         - O(log n)
         - Uses Red-Black Tree


         📌 4) HOW HASHSET WORKS INTERNALLY
         -----------------------------------------------------------
         HashSet internally uses HashMap

         element → stored as KEY in HashMap
         value → dummy constant object

         Steps:
         1. element.hashCode()
         2. bucket index calculated
         3. equals() used to avoid duplicates

         Important Interview Line:
         "HashSet uses hashCode and equals methods to ensure uniqueness."


         📌 5) IMPORTANT METHODS
         -----------------------------------------------------------

         // add element (returns false if duplicate)
         set.add(e);

         // check element
         set.contains(e);

         // remove element
         set.remove(e);

         // number of elements
         set.size();

         // empty check
         set.isEmpty();

         // remove all
         set.clear();

         // iteration
         set.iterator();


         📌 6) BULK OPERATIONS (VERY IMPORTANT)
         -----------------------------------------------------------

         UNION
         set1.addAll(set2);

         INTERSECTION
         set1.retainAll(set2);

         DIFFERENCE
         set1.removeAll(set2);

         SUBSET CHECK
         set1.containsAll(set2);


         📌 7) ITERATION TECHNIQUES
         -----------------------------------------------------------

         // for-each
         for(E e : set)

         // iterator (safe removal)
         Iterator<E> it = set.iterator();

         while(it.hasNext()){
             E val = it.next();
             if(condition)
                 it.remove();
         }

         Note:
         Removing inside for-each → ConcurrentModificationException


         📌 8) TIME COMPLEXITY
         -----------------------------------------------------------
         HashSet add()      → O(1)
         HashSet contains() → O(1)
         HashSet remove()   → O(1)

         TreeSet add()      → O(log n)
         TreeSet contains() → O(log n)


         📌 9) COMMON INTERVIEW PROGRAMS USING SET
         -----------------------------------------------------------
         • Remove duplicates from list
         • Find duplicate elements
         • Compare two collections ignoring order
         • Check unique dropdown values (Selenium)
         • Validate DB vs UI data


         📌 10) IMPORTANT INTERVIEW QUESTIONS
         -----------------------------------------------------------

         Q: Why duplicates not allowed in HashSet?
         A: Because of hashCode() and equals()

         Q: Why TreeSet doesn't allow null?
         A: Because it uses compareTo() for sorting

         Q: Fastest Set?
         A: HashSet

         Q: When to use LinkedHashSet?
         A: When insertion order required

         Q: Can we store heterogeneous elements?
         A: HashSet yes, TreeSet only comparable types


         📌 11) REAL AUTOMATION TESTING USAGE
         -----------------------------------------------------------

         Remove duplicates
         new HashSet<>(list)

         Validate no duplicates
         list.size() == new HashSet<>(list).size()

         Compare UI and DB
         uiSet.retainAll(dbSet)

         Dropdown validation
         actual.containsAll(expected)


         📌 12) WHEN TO USE WHICH SET
         -----------------------------------------------------------
         HashSet       → Fast lookup
         LinkedHashSet → Maintain insertion order
         TreeSet       → Sorted output


         📌 FINAL INTERVIEW ONE-LINER
         -----------------------------------------------------------
         "HashSet is used for fast operations, LinkedHashSet when order matters,
         and TreeSet when sorted data is required."

         ===========================================================
         END OF SET REVISION
         ===========================================================
        */
    }
}
