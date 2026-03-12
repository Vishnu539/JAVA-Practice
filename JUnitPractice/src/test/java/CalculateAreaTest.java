import org.example.CalculateArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateAreaTest {
    CalculateArea calculate = new CalculateArea();

    @Test
    void testSquare(){
        assertEquals(16, calculate.square(4));
    }

    @Test
    void testCircle(){
        assertEquals(192, calculate.circle(8));
    }
}
