import java.util.*;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Object, String> map = new WeakHashMap<>();

        Object key1 = new Object(); //strong reference
        Object key2 = new Object(); //strong reference
        
        map.put(key1, "Value 1");
        map.put(key2, "Value 2");

        System.out.println(map);

        key1 = null; // remove strong reference
        System.gc();

        System.out.println(map); // weak reference key1 is removed from the map by garbage collection


        // String pitfall
        WeakHashMap<String, String> mpp = new WeakHashMap<>();

        String key3 = "ABC";
        mpp.put(key3, "Value 3"); 
        // key is a string literal so it cannot be stored as a weak reference as JVM stores plain text as strong reference in string pool.
        // String pool is a special memory area inside JVM where string literals are stored. It maintains strong references to interned strings.

        System.out.println(mpp);

        key3 = null;
        System.gc(); // Garbage collector will not work on string literal.

        System.out.println(mpp); // Still prints {ABC=Value 1}

        // To overcome this problem we can create a new String object.
        String key4 = new String("BCD"); // This is not stored in string pool. This created a heap object eligible for GC

        mpp.put(key4, "Value 4");
        System.out.println(mpp);

        key4 = null;
        System.gc(); // Garbage collector can now remove key4

        System.out.println(mpp); // only key3 will be stored in the map
    }
}