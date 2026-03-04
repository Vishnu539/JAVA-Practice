package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 10, 50);
        System.out.println(nums);

        // Transforming into another Collection
        Set<Integer> setNums = nums.stream().collect(Collectors.toSet());
        System.out.println(setNums);

        System.out.println();

        // Collecting to a specific Collection
        PriorityQueue<Integer> priorityNums = nums.stream().collect(Collectors.toCollection(PriorityQueue::new));
        System.out.println(priorityNums);

        System.out.println();

        // Joining strings - concatenate stream elements into a single stream
        List<String> names = Arrays.asList("Sonny", "Hayes");
        String fullName = names.stream().collect(Collectors.joining(" "));
        System.out.println(fullName);

        System.out.println();

        // Summarizing data - generates statistical summary (count, sum, avg, min, max)
        List<Integer> data = Arrays.asList(1, 4, 2, 6, 9, 7, 3, 8);
        IntSummaryStatistics dataSummary = data.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println(dataSummary);
        System.out.println(dataSummary.getCount());
        System.out.println(dataSummary.getSum());
        System.out.println(dataSummary.getMin());
        System.out.println(dataSummary.getAverage());
        System.out.println(dataSummary.getMax());

        System.out.println();

        // Grouping elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Coconut", "Dragon fruit", "Grapes", "Orange", "Guava", "Mango");
        System.out.println(fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.length())));
        System.out.println(fruits.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(" "))));
        System.out.println(fruits.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> treeMap = fruits.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        System.out.println();

        // Partitioning elements - partition elements into two groups (true and false) based on a predicate
        System.out.println(fruits.stream().collect(Collectors.partitioningBy(x -> x.length() > 6)));

        System.out.println();

        // Mapping and collecting - applies a mapping function before collecting
        System.out.println(fruits.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toSet())));

        System.out.println();
        System.out.println("Pracitce results:");


        // Practice
        List<String> months = Arrays.asList("January", "Febuary", "March", "April", "may", "June");
        System.out.println(months);

        // Task 1 - Collecting names by length
        System.out.println(months.stream().collect(Collectors.groupingBy(String::length)));

        // Task 2 - Counting word occurences
        System.out.println(months.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Tash 3 - Partitioning even and odd length months
        System.out.println(months.stream().collect(Collectors.partitioningBy(x -> x.length() % 2 == 0)));

        // Task 4 - Create a Map from stream elements
        System.out.println(months.stream().collect(Collectors.toMap(String::toUpperCase, String::length)));
    }
}
