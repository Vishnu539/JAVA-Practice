package Streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamsDemo {
    public static void main(String[] args) {
        // Special Stream types designed for int, long, and double
        // Three types - IntStream, LongStream, DoubleStream

        // IntStream
        int[] nums = {10, 20, 30};

        // Creating IntStream
        // 1. From primitive types
        IntStream intStream = Arrays.stream(nums);

        // 2. of()
        IntStream.of(1, 2, 3);

        // 3. range()
        IntStream.range(1, 5); // exludes 5

        // 4. rangeClosed()
        IntStream.rangeClosed(1, 5); // includes 5

        // IntStream methods
        System.out.println(intStream.sum());
        System.out.println(intStream.max());
        System.out.println(intStream.min());
        System.out.println(intStream.average());


        // LongStream
        LongStream longStream = LongStream.of(1234567890, 987654321);
        System.out.println(longStream.max());
        System.out.println(longStream.min());

        // DoubleStream
        DoubleStream doubleStream = DoubleStream.of(3.15, 9.68);
        System.out.println(doubleStream.count());

        // Note: Streams in Java are single-use objects. 
        // You cannot use the same stream more than once.
        // Once a terminal operation runs, the stream is closed.
        // For practice purposes, use one operation at a time while commenting the others.
    }
}
