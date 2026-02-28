import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> sm = new TreeMap<>();
        sm.put("Cathy", 70);
        sm.put("Abby", 90);
        sm.put("Bob", 98);
        sm.put("David", 85);
        sm.put("Emily", 82);

        // SortedMap is an interface. It's implementation class is TreeMap. 
        
        System.out.println(sm);  // Map will be sorted based on keys
        
        // SortedMap extends Map but it has it's own unique methods such as

        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap("Cathy"));
        System.out.println(sm.tailMap("Bob"));
        System.out.println(sm.subMap("Abby", "Emily"));


        System.out.println();

        // TreeMap implementation
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Cathy", 70);
        tm.put("Abby", 90);
        tm.put("Bob", 98);
        tm.put("David", 85);
        tm.put("Emily", 82);

        // Important methods of TreeMap
        System.out.println(tm.higherKey("Bob"));
        System.out.println(tm.lowerKey("Bob"));
        System.out.println(tm.ceilingKey("David"));
        System.out.println(tm.floorKey("Bob"));
    }
}
