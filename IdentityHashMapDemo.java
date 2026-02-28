import java.util.*;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");

        Map<String, Integer> map = new IdentityHashMap<>();
        // IdentityHashMap does not use String class hash code. It will use Object class hash code for memory allocation by default.
        // That is why the hash code of key1 and key2 will be different even though their content is same ("key").
        // But in case of HashMap, it will use the String class' hashcode and so it will update the value of key2 replaces the value of key1.
        // IdentityHashMap does not use equlas() method internally to check if two keys same or not unlike HashMap (which uses equals() method). IdentityHashMap uses == operator to check for equality.

        map.put(key1, 1);
        map.put(key2, 2);

        System.out.println(map); // prints two key-value pairs for the same key content "key".

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2)); // returns two different hash codes for the same key content "key" since IdentityHashCode uses object class hashcode by default.
        System.out.println(map.size()); // The size will also be 2 in case of IdentityHashMap. But the size will be 1 in case of normal HashMap.

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode()); // returns same hash code for two keys since their content is same ("key"). Uses String class hash code by default.
    }
}
