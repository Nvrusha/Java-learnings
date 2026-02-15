package Oct.Chapter18_CollectionFramework.Map;

public class Map_Notes {
    public static void main(String[] args) {

        /*
===========================================================
                JAVA MAP – INTERVIEW REVISION NOTES
===========================================================

📌 1) WHAT IS A MAP?
-----------------------------------------------------------
Map stores data in KEY → VALUE pairs.

• Each KEY must be UNIQUE
• Values can be duplicate
• Not part of Collection interface (separate hierarchy)

Example:
A → 10
B → 20
C → 30

Real use: Frequency counting, caching, lookup tables

Interview Definition:
"Map is a data structure that stores unique keys mapped to values and provides fast retrieval using hashing."


📌 2) MAP HIERARCHY
-----------------------------------------------------------
Map (interface)
   |
   |-- HashMap
   |-- LinkedHashMap
   |-- TreeMap
   |-- Hashtable


📌 3) DIFFERENCE BETWEEN MAP TYPES
-----------------------------------------------------------
HashMap
- Random order
- Fastest
- Allows 1 null key, multiple null values
- Not thread safe
- O(1)

LinkedHashMap
- Maintains insertion order
- Slightly slower than HashMap

TreeMap
- Sorted order (Red-Black Tree)
- No null key
- O(log n)

Hashtable
- Thread safe (synchronized)
- No null key/value
- Slow → Legacy class


📌 4) HOW HASHMAP WORKS INTERNALLY
-----------------------------------------------------------
1. Key → hashCode()
2. hashCode → bucket index
3. Store in bucket
4. Collision → LinkedList
5. After Java 8 → Balanced Tree

Important Interview Line:
"HashMap uses hashing and bucket indexing to achieve constant time complexity."


📌 5) IMPORTANT METHODS
-----------------------------------------------------------

// insert or update
map.put(key, value);

// get value
map.get(key);

// check key
map.containsKey(key);

// remove
map.remove(key);

// size
map.size();

// empty check
map.isEmpty();

// return keys
map.keySet();

// return values
map.values();

// best iteration method
map.entrySet();

// modern frequency method
map.getOrDefault(key, 0);

// insert only if missing
map.putIfAbsent(key, value);

// replace value
map.replace(key, value);


📌 6) ITERATION TECHNIQUES
-----------------------------------------------------------

// BEST METHOD
for(Map.Entry<K,V> e : map.entrySet())

// Only keys (slower)
for(K key : map.keySet())

// Java 8
map.forEach((k,v) -> System.out.println(k + " " + v));


Why entrySet is best?
→ avoids extra lookup (map.get(key))


📌 7) TIME COMPLEXITY
-----------------------------------------------------------
put()      → O(1)
get()      → O(1)
remove()   → O(1)
TreeMap    → O(log n)


📌 8) COMMON INTERVIEW PROGRAMS USING MAP
-----------------------------------------------------------
• Character frequency
• Duplicate characters
• First non-repeating character
• Anagram check
• Counting words
• Two sum problem


📌 9) IMPORTANT INTERVIEW QUESTIONS
-----------------------------------------------------------

Q: Can HashMap have null key?
A: Yes, only one null key

Q: Why HashMap faster than TreeMap?
A: O(1) vs O(log n)

Q: Difference HashMap vs Hashtable?
A: Hashtable synchronized (thread-safe but slow)

Q: When to use TreeMap?
A: When sorted order required

Q: Why entrySet faster than keySet?
A: keySet requires extra lookup map.get(key)


📌 10) getOrDefault() (VERY IMPORTANT)
-----------------------------------------------------------
Used in frequency problems:

map.put(ch, map.getOrDefault(ch, 0) + 1);

Meaning:
If key exists → return value
Else → return default (0)


📌 11) SPACE & PERFORMANCE
-----------------------------------------------------------
HashMap average performance O(1)
Worst case O(n) (rare collisions)


📌 12) WHEN TO USE WHICH MAP
-----------------------------------------------------------
HashMap       → Fast lookup (most cases)
LinkedHashMap → Maintain insertion order
TreeMap       → Sorted output
Hashtable     → Multi-threaded legacy systems


📌 FINAL INTERVIEW ONE-LINER
-----------------------------------------------------------
"HashMap is preferred for fast lookup, TreeMap for sorting, and LinkedHashMap when order matters."

===========================================================
END OF MAP REVISION
===========================================================
*/


    }
}
