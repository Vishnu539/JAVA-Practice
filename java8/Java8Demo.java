package java8;
import java.util.*;
import java.util.function.*;
import java.util.function.Consumer;

public class Java8Demo {
    public static void main(String[] args) {
        // Java 8 Features - Supplier, Predicate, Function, Consumer, BiPredicate, BiFunction, BiConsumer, UnaryOperator, BinaryOperator

        // Supplier
        Supplier<String> supplier = () -> "Hello world!";
        System.out.println("Supplier message: " + supplier.get());

        // Predicate
        Predicate<Integer> predicate = (x) -> x % 2 == 0; // checks if x is even
        System.out.println(predicate.test(10));

        // Function
        Function<Integer, Integer> function = (x) -> x * x; // squares the number
        System.out.println(function.apply(5));

        // Consumer
        Consumer<String> consumer = name -> System.out.println(name.toUpperCase()); // just prints the input
        consumer.accept("vishnu");
        
        // BiPredicate
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
        System.out.println(biPredicate.test(5, 3)); // 5 * 3 = 15

        // BiFunction
        BiFunction<String, String, Integer> biFunction = (a, b) -> a.length() + b.length();
        System.out.println(biFunction.apply("hello", "world")); // sum the length of two strings

        // BiConsumer
        BiConsumer<String, String> biConsumer = (firstName, lastName) -> System.out.println(firstName + " " + lastName);
        biConsumer.accept("Vishnu", "Chilakala"); // combines two strings

        // UnaryOperator
        UnaryOperator<Integer> unaryOperator = n -> n * 10;
        System.out.println(unaryOperator.apply(10)); // 10 * 10 = 100

        // BinaryOperator
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(4, 5));

        // Method Reference
        List<String> students = Arrays.asList("Alice", "Bob", "Candice", "Danny");
        students.forEach(x -> System.out.println(x)); // using Consumer as a Lambda expression inside forEach method.
        students.forEach(System.out::println); // does the same as above but much cleaner and readable. "::" is called method reference. It passes the method as a parameter.
        students.forEach(Java8Demo::changeCase); // method reference for custom methods
    }

    public static void changeCase(String s){
        System.out.println(s.toUpperCase());
    }
}