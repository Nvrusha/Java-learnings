package Oct.Chapter12_Strings;

public class Lab022_Notes {
    public static void main(String[] args) {
        /*
         ===========================================================
                     JAVA STRING & OBJECT – INTERVIEW NOTES
         ===========================================================


         📌 1) WHAT IS A STRING?
         -----------------------------------------------------------
         String represents sequence of characters.

         • String is a CLASS (not primitive)
         • Available in java.lang package
         • Stored in heap memory
         • Most frequently used object in Java

         Interview Line:
         "String is an immutable object used to store character data."


         📌 2) STRING IMMUTABILITY (MOST IMPORTANT)
         -----------------------------------------------------------
         Once created → cannot be changed

         Any modification creates NEW object
         Old object remains unchanged

         WHY IMMUTABLE?
         • Security (URLs, file paths, DB connections)
         • Thread safety
         • String pool reuse
         • HashMap performance (hashcode caching)

         Interview Question:
         Why String is immutable in Java?


         📌 3) STRING CONSTANT POOL (SCP)
         -----------------------------------------------------------
         Special memory area inside Heap

         String a = "hello";
         String b = "hello";
         → Both point to SAME object

         String a = new String("hello");
         → New object in heap

         Literal → SCP
         new keyword → Heap

         Interview Favorite:
         Difference between literal and new String


         📌 4) == VS equals()
         -----------------------------------------------------------
         == compares MEMORY ADDRESS
         equals() compares VALUE

         MOST COMMON INTERVIEW TRAP QUESTION


         📌 5) IMPORTANT STRING METHODS
         -----------------------------------------------------------
         length()          → number of characters
         charAt(i)         → char at index
         substring(a,b)    → b excluded
         contains()        → check text
         equalsIgnoreCase()
         trim()            → removes start/end spaces only
         replace()
         split()
         toCharArray()
         toUpperCase()/toLowerCase()

         Interview:
         Predict output questions


         📌 6) STRING VS STRINGBUILDER VS STRINGBUFFER
         -----------------------------------------------------------
         String
         • Immutable
         • Slow when modifying repeatedly

         StringBuilder
         • Mutable
         • Fastest
         • Not thread safe

         StringBuffer
         • Mutable
         • Thread safe
         • Slower than StringBuilder

         Interview:
         Which is fastest? → StringBuilder


         📌 7) STRING INTERN()
         -----------------------------------------------------------
         Moves string to String Constant Pool
         Used for memory optimization


         📌 8) HASHCODE CACHING
         -----------------------------------------------------------
         String stores hashcode after first calculation
         Makes HashMap faster


         📌 9) COMMON STRING LOGIC QUESTIONS
         -----------------------------------------------------------
         • Reverse string
         • Palindrome
         • Anagram
         • Duplicate characters
         • Frequency counting
         • First non-repeating character


         ===========================================================
                           OBJECT CONCEPTS
         ===========================================================

         📌 10) WHAT IS OBJECT?
         -----------------------------------------------------------
         Instance of a class

         Has:
         • State (variables)
         • Behavior (methods)

         Stored in HEAP
         Reference stored in STACK


         📌 11) STACK VS HEAP
         -----------------------------------------------------------
         STACK
         • Stores references & method calls
         • Faster
         • LIFO

         HEAP
         • Stores objects
         • Shared across threads
         • Managed by Garbage Collector

         VERY COMMON INTERVIEW QUESTION


         📌 12) GARBAGE COLLECTION
         -----------------------------------------------------------
         Automatic memory cleanup

         Object eligible when:
         No references pointing to it

         System.gc() only REQUESTS GC


         📌 13) PASS BY VALUE IN JAVA
         -----------------------------------------------------------
         Java is ALWAYS pass by value

         For objects:
         Copy of reference passed
         Object data can change
         Reference cannot change original


         📌 14) IMMUTABLE OBJECT ADVANTAGES
         -----------------------------------------------------------
         • Thread safe
         • Secure
         • Cacheable
         • Reusable

         Example: String, Integer


         📌 FINAL INTERVIEW ONE-LINER
         -----------------------------------------------------------
         "String is immutable and stored in the String Constant Pool,
         objects are stored in heap and referenced from stack,
         and Java always uses pass-by-value."

         ===========================================================
         END OF STRING REVISION
         ===========================================================
        */
    }
}
