package Oct.Ex18_CollectionFramework.Map;

public class Map_Notes {
    public static void main(String[] args) {

        /*
         Map in Java: A Map is a collection in Java used to store key-value pairs. Each key is unique,
         and each key maps to exactly one value.

         Key Features:

         1. Stores key-value pairs (like a dictionary in Python).
         2. Keys are unique; duplicate keys overwrite the previous value.
         3. Allows one null key (HashMap) and multiple null values.

         Common Implementations:

         1. **HashMap**:

            - Unordered, fast for add/remove/search.
            - Allows one null key and multiple null values.
            - Not thread-safe.

         2. **LinkedHashMap**:

            - Maintains insertion order.
            - Slightly slower than HashMap.
            - Allows one null key and multiple null values.

         3. **TreeMap**:

            - Maintains keys in sorted (natural) order.
            - Does not allow null keys but allows null values.
            - Slower than HashMap and LinkedHashMap due to sorting.

         Common Methods:

         1. put(key, value): Adds or updates a key-value pair.
         2. get(key): Retrieves the value for the given key.
         3. remove(key): Removes the key-value pair.
         4. containsKey(key): Checks if the key exists.
         5. containsValue(value): Checks if the value exists.
         6. size(): Returns the number of key-value pairs.
         7. keySet(): Returns all the keys.
         8. values(): Returns all the values.
         9. entrySet(): Returns a set of all key-value pairs (Map.Entry).

         When to Use:

         - Use Map when data needs to be stored as key-value pairs.
         - Use HashMap for performance (unordered data).
         - Use LinkedHashMap if insertion order matters.
         - Use TreeMap if sorted keys are required.
        */

    }
}
