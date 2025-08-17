package Oct.Chapter18_CollectionFramework.List;

public class ListNotes {
    public static void main(String[] args) {
        /*
         What is a List?
         A List in Java is an ordered collection that:

         1. Allows duplicate elements.
         2. Maintains the insertion order of elements.

         Key Features of List:
         1. Index-Based Access:
            - Elements in a list can be accessed using an index (starting from 0).
         2. Dynamic Size:
            - The size of the list grows or shrinks dynamically as elements are added or removed.
         3. Allows Duplicates:
            - A list can contain duplicate values.

         Commonly Used List Implementations:
         1. ArrayList:
            - Backed by a dynamic array.
            - Best for fast access (reading elements).
            - Slower for insertions/deletions in the middle of the list.
         2. LinkedList:
            - Backed by a doubly linked list.
            - Best for fast insertions/deletions.
            - Slower for accessing elements (sequential traversal).
         3. Vector (Legacy):
            - Similar to ArrayList but synchronized (thread-safe).

         When to Use Which Implementation?

         Use ArrayList:
         - When fast random access is required.
         - For most general-purpose cases.

         Use LinkedList:
         - When frequent insertions or deletions are needed.
         Avoid Vector:
         - Use ArrayList unless synchronization is required.
         - For thread-safe operations, consider CopyOnWriteArrayList.
        */

    }
}
