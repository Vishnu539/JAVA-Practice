import org.junit.jupiter.api.Test;
import org.example.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void test(){
        Calculator calc = new Calculator();
        int result = calc.divide(10, 5);
        assertEquals(2, result);
    }
}