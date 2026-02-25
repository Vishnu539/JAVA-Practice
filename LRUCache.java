import java.util.*;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> lru = new LRUCache<>(3);
        lru.put("Apple", 30);
        lru.put("Banana", 40);
        lru.put("Cucumber", 50);

        System.out.println(lru); // no capacity overload till here

        lru.get("Banana");

        System.out.println(lru); // Banana is the most recently used, so it comes last.

        lru.put("Dates", 60);

        System.out.println(lru); // capacity exceeded. so Apple is removed from the cache.
    }
}