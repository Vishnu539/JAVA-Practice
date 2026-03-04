package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 20, 30, 40, 50, 50);

        // 1. collect
        ls.stream().skip(2).collect(Collectors.toList());
        ls.stream().toList(); // simpler approach

        // 2. forEach
        ls.stream().forEach(x -> System.out.println(x));
        
        // 3. reduce - combines elements to produce a sinlge result
        Optional<Integer> optionalStream = ls.stream().reduce((x, y) -> x + y); // sum of all elements of the list
        System.out.println(optionalStream.get());
        Optional<Integer> methodReference = ls.stream().reduce(Integer::sum); // sum of all elements of the list

        // 4. anyMatch, allMatch, noneMatch
        boolean any = ls.stream().anyMatch(x -> x % 2 == 0); // is there any element that is divisible by 2 -> true
        boolean all = ls.stream().allMatch(x -> x > 10); // are all the elements in the list greater than 10 -> false
        boolean none = ls.stream().noneMatch(x -> x > 50); // are none of the elements in the list greater than 50 -> true
        System.out.println(any + " " + all + " " + none);

        // 5. findFirst, findAny
        Optional<Integer> findFirstElement = ls.stream().findFirst();
        Optional<Integer> findAnyElement = ls.stream().findAny();
        System.out.println(findFirstElement.get() + " " + findAnyElement.get());
    }
}
