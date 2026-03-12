import org.example.ReverseString;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseStringTest {
    ReverseString reverse = new ReverseString();
    String expectedMsg = "gnimmargorP avaJ"; // Java Programming
    String actualMsg = reverse.reverseString("Java Programming");

    @Test
    public void testAssertions(){
        assertEquals(expectedMsg, actualMsg, "Expeted equals actual"); // checks if exprected value equals actual value.
//        assertNotEquals(expectedMsg, actualMsg); // checks if expected value not equals original value. (test fails)
        assertTrue(actualMsg.length() == 16); // checks whether a condition is true
        assertFalse(actualMsg.length() < 16); // checks whether a condition is false
        assertNull(null); // checks if an object is null
        assertNotNull(actualMsg); // checks if an object is not null
//        assertSame(expectedMsg, actualMsg); // checks if two references point to the same object in memory (test fails)
        assertNotSame(expectedMsg, actualMsg); // checks that two objects do not reference the same object
        assertAll( // allow multiple assertions to run together.
                () -> assertEquals(4, 2 + 2),
                () -> assertTrue(actualMsg.equals(expectedMsg)),
                () -> assertThrows(ArithmeticException.class, () -> { // checks if a specific exception is thrown
                    int x = 10 / 0;
                })
        );
    }
}
