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
    }
}