import java.util.*;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer, String> nm = new TreeMap<>();

        nm.put(4, "Value 4");
        nm.put(1, "Value 1");
        nm.put(3, "Value 3");
        nm.put(5, "Value 5");
        nm.put(2, "Value 2");

        System.out.println(nm);

        System.out.println(nm.pollFirstEntry());
        System.out.println(nm.pollLastEntry());
        
        System.out.println(nm);
    }
}
