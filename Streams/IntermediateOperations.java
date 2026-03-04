package Streams;
import java.util.*;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        // Intermediate operations transform a stream into another stream
        // They are lazy, meaning they don't execute untill a terminal operator is ivoked

        // 1. Filter
        List<String> students = Arrays.asList("Ajay Sanyal", "Dhurandhar", "Hamza", "Ali", "Rehman", "Chaudary Aslam", "Babu", "Hamza", "Iqbal", "Donga", "Yaleena", "Harshad", "Pappu", "Bade Saab");
        Stream<String> newStudents = students.stream().filter(student -> student.startsWith("D")); // no filtering at this point (termial operation required)

        // 2. Map
        Stream<String> upperNames = students.stream().map(String::toUpperCase);

        // 3. Sorted
        Stream<String> sortedStream1 = students.stream().sorted();
        Stream<String> sortedStream2 = students.stream().sorted((x, y) -> y.length() - x.length()); // Custom Comparator

        // 4. Distinct
        Long countCharacters = students.stream().filter(x -> x.startsWith("H")).distinct().count();
        System.out.println(countCharacters);

        // 5. Limit
        System.out.println(students.stream().limit(5).toList());

        // 6. Peek
        Stream.iterate(10, x -> x + 1).limit(50).peek(System.out::println).count();
    }
}
