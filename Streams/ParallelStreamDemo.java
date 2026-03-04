package Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        // a type of stream that enable parallel processing of elements
        // allowing multiple threads to process parts of stream simultaneously
        // this can significantly improve performance for larger datasets
        // workload is distributed across multiple threads

        // Example - calculating the factorial of first 20000 numbers using Stream
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialStream = list.stream().map(ParallelStreamDemo::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");

        // Same thing with parallel stream (should reduce the time taken significantly)
        startTime = System.currentTimeMillis();
        List<Long> factorialStream2 = list.parallelStream().map(ParallelStreamDemo::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " ms");

        // Parallel streams are most effective for CPU-intensive or large datasets where tasks are independent
        // They may add overhead for simple tasks and smaller datasets
    }

    private static long factorial(int n){
        long result = 1;
        for(int i = 1; i <= n; i++) result *= i;
        return result;
    }
}