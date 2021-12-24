package challenges.week_1.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FizzBuzzTests {
    String[] fizzBuzzTestArr = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
    FizzBuzz fizzBuzz = new FizzBuzz();
    int fizzBuzzTestRange = 15;

    @Test
    public void fizzBuzzGenerator(){
        assertArrayEquals(fizzBuzzTestArr, fizzBuzz.fizzBuzzGenerator(fizzBuzzTestRange));
    }
}


