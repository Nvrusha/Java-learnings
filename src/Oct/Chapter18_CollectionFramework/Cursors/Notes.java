package Oct.Chapter18_CollectionFramework.Cursors;

public class Notes {
    /*
     ====================== CURSORS IN JAVA ======================
     A Cursor in Java is an object used to iterate (traverse) over a collection.
     It allows us to read elements one by one from a collection like List, Set, etc.
     Java provides three types of cursors:
     1. Enumeration
     2. Iterator
     3. ListIterator
     ====================== 1. ENUMERATION ======================
     Enumeration is the oldest cursor introduced in Java 1.0.
     It is mainly used with legacy classes like Vector and Hashtable.
     It allows only READ access (cannot modify the collection).
     Methods:
     hasMoreElements() -> checks if more elements are present
     nextElement() -> returns the next element
     Example:
     Enumeration e = vector.elements();
     while(e.hasMoreElements()){
         System.out.println(e.nextElement());
     }
     Limitations:
     1. Only works with legacy classes
     2. Cannot remove or modify elements
     ====================== 2. ITERATOR ======================
     Iterator was introduced in Java 1.2 with the Collection Framework.
     It is the most commonly used cursor.
     It works with all Collection classes.
     Methods:
     hasNext() -> checks if next element exists
     next() -> returns the next element
     remove() -> removes the current element
     Example:
     Iterator<Integer> it = list.iterator();
     while(it.hasNext()){
         System.out.println(it.next());
     }
     Advantage:
     We can remove elements safely while iterating.
     ====================== 3. LISTITERATOR ======================
     ListIterator was introduced in Java 1.2.
     It is used only with LIST implementations like ArrayList and LinkedList.
     It allows bidirectional traversal.
     Methods:
     hasNext() -> check next element
     next() -> move forward
     hasPrevious() -> check previous element
     previous() -> move backward
     add() -> add element
     set() -> update element
     remove() -> remove element
     Example:
     ListIterator<Integer> li = list.listIterator();
     while(li.hasNext()){
         System.out.println(li.next());
     }
     ====================== DIFFERENCE ======================
     Enumeration:
     - Works with legacy classes
     - Only forward direction
     - Read only
     Iterator:
     - Works with all collections
     - Only forward direction
     - Can remove elements
     ListIterator:
     - Works only with List
     - Forward + backward traversal
     - Can add, update, remove elements
     =========================================================
    */


}
