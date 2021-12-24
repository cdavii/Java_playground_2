package challenges.week_2.fibonacci;

import org.junit.jupiter.api.Test;
import static challenges.week_2.fibonacci.FibonacciSequence.fibonacciArray;
import static org.junit.jupiter.api.Assertions.*;


public class FibonacciSequenceTests {
    int[] expectedSequence10 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
    int fibonacci31 = 832040;

    @Test
    public void FibonacciTest10(){
        assertArrayEquals(expectedSequence10, fibonacciArray(10));
    }

    @Test
    public void FibonacciTest0() {
        assertNull(fibonacciArray(0));
    }

    @Test
    public void FibonacciTestIndex(){
        assertEquals(fibonacci31, fibonacciArray(31)[30]);
    }
}
