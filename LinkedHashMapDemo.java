import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>(11, 0.5f, false); // by default, accessOrder is set to false. That means Insertion Order is followed.
        lm.put("Apple", 80);
        lm.put("Banana", 70);
        lm.put("Guava", 86);
        lm.put("Mango", 90);

        System.out.println(lm); // elements will be printed in the order they are inserted.


        LinkedHashMap<String, Integer> lm1 = new LinkedHashMap<>(11, 0.5f, true); // accessOrder is set to true. That means Access Order is followed.
        lm1.put("Apple", 80);
        lm1.put("Banana", 70);
        lm1.put("Guava", 86);
        lm1.put("Mango", 90);

        System.out.println(lm1); // no change in order by default.

        lm1.get("Banana");

        System.out.println(lm1); // Now Banana will be removed from the second place and added at the last place.
    }
}