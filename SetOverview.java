import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetOverview {
    public static void main(String[] args) {
        Set<Double> set1 = new HashSet<>(); // Maintains no order

        set1.add(1.9);
        set1.add(4.5);
        set1.add(2.3);
        set1.add(1.9);
        set1.add(3.2);

        // Common methods in Set (Applied for all Set implementations)

        System.out.println(set1);
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
        System.out.println(set1.contains(6));
        System.out.println(set1.hashCode()); // sum of all hashcodes of all elements in the set

        System.out.println();

        Set<Integer> set2 = new LinkedHashSet<>(); // Maintains insertion order
        // No unique methods
        set2.add(10);
        set2.add(50);
        set2.add(30);
        set2.add(60);
        set2.add(20);
        set2.add(40);
        set2.add(10);
        System.out.println(set2);

        System.out.println();

        TreeSet<String> set3 = new TreeSet<>(); // Maintains sorted order
        // Has some unique methods (from NavigableSet)
        set3.add("Apple");
        set3.add("Grapes");
        set3.add("Mango");
        set3.add("Banana");

        System.out.println(set3);
        System.out.println(set3.higher("Mango"));
        System.out.println(set3.lower("Banana"));
        System.out.println(set3.ceiling("Grapes"));
        System.out.println(set3.floor("Apple"));
        System.out.println(set3.first());
        System.out.println(set3.last());

        System.out.println();

        EnumSet<Day> set4 = EnumSet.allOf(Day.class);
        System.out.println(set4);

        EnumSet<Day> set5 = EnumSet.noneOf(Day.class);
        System.out.println(set5);

        EnumSet<Day> set6 = EnumSet.range(Day.MONDAY, Day.WEDNESDAY);
        System.out.println(set6);
    }

    public enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
    }
}
