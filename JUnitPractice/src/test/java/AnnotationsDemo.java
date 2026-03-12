import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AnnotationsDemo {
    // Annotations are special markers placed above methods or classes to tell the JUnit Framework how a test should behave or when it should run.

    @DisplayName("Addition of two numbers") // provide a custom readable name for a test
    @Test // marks a method as a test case
    void addNumbers(){
        assertEquals(5, 2 + 3);
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Running before each test");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Running after each test");
    }

    // All methods applying @BeforeAll and @AfterAll should be static
    @BeforeAll
    static void beforeAll(){
        System.out.println("Running before all test methods");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Running after all test methods");
    }

    @Disabled
    void disabled(){
        System.out.println("This method will not run. It will be skipped temporarily");
    }

    @RepeatedTest(5)
    void repeatedTest(){
        assertTrue(5 < 10);
    }

    @ParameterizedTest // allows running the same test with multiple input values
    @ValueSource(ints = {2,4,6,8})
    void parameterisedTest(int num){
        assertTrue(num % 2 == 0);
    }
}
