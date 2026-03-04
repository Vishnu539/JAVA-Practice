package Streams;
import java.util.stream.Stream;
import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
        // Stream is a feature introduced in Java 8
        // Used to process collections of data in declarative and functional manner.
        // Simplify data processing
        // Embrace functional programming
        // Improve readability and maintainability
        // Enable easy parallelism

        // What is a Stream?
        // A sequence of elements supporting fuctional and declarative programming

        // How to use Stream?
        // Source -> intermediate operation (filter, map, etc.) -> terminal operation (count, asList, etc.)

        // Example
        List<Integer> nums = Arrays.asList(1, 10, 15, 20, 23, 26, 27);
        System.out.println(nums);

        // Task - count the number of even numbers in the list
        // Method 1 - traditional approach
        
        int count = 0;
        for(Integer num : nums){
            if(num % 2 == 0) count++;
        }
        System.out.println(count);

        // Method 2 - using Stream
        System.out.println(nums.stream().filter(num -> num % 2 == 0).count());

        // // Creating Streams
        // 1. From Collections
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        Stream<Integer> stream = numbers.stream();

        // 2. From Arrays Collection
        String[] days = {"Monday", "Tuesday", "Wednesday"};
        Stream<String> daysStream = Arrays.stream(days);

        // 3. Using Stream.of() method
        Stream<String> streamOf = Stream.of("ABC", "DEF");

        // 4. Infinite Stream
        Stream<String> infiniteStream1 = Stream.generate(() -> "Hello");
        Stream<String> infiniteStream2 = Stream.generate(() -> "Hello").limit(100); // puts a limit to the generation
        Stream<Integer> iterateStream = Stream.iterate(10, x -> x + 1).limit(100); // seed - starting point of iteration (output will be 11, 12, 13,...,100 in this case)
    }
}
