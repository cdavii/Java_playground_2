package challenges.week_2.palindrome_checker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeCheckerTests {
    boolean hannah = true;
    boolean racecar = true;
    boolean callum = false;
    PalindromeChecker checker = new PalindromeChecker();

    @Test
    public void PalindromeChecker(){
        assertEquals(hannah, checker.isPalindrome("hannah"));
        assertEquals(racecar, checker.isPalindrome("RACECAR"));
        assertEquals(callum, checker.isPalindrome("CaLlUm"));
    }

    @Test
    public void SingleCharChecker(){
        assertEquals(false, checker.isPalindrome("A"));
    }

    @Test
    public void CounterChecker(){
        assertEquals(3, checker.containsPalindromes("Anna, Hannah, Otto and Clive are going to a party."));
    }
}
