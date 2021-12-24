package challenges.week_2.palindrome_checker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PalindromeChecker{

   /* public boolean isPalindrome(String input){
        char[] forwards = input.toLowerCase().toCharArray();

        List<char[]> forwardAsList = Arrays.asList(forwards);
        List<char[]> backwardAsList = Collections.reverse(forwardAsList);

        Object[] backwards = backwardAsList.toArray();

        return Arrays.equals(forwards, backwards);
    }
*/

    public boolean isPalindrome(String toCheck) {
        // String toCheck is converted to lowercase so that palindromes like "racecar" and "RaCeCaR" both return true.
        String input = toCheck.toLowerCase();
        int length = input.length();
        int startCounter = 0;
        int endCounter = length - 1;

        /* Without this if statement the .containsPalindromes method was counting single letter words as palindromes
        which while technically true I didn't want to include. */
        if (length == 1) {
            return false;
        }else {
            while (endCounter > startCounter) {
                //Counters can be iterated on within a single line of code which I didn't realise before this
                char forwardChar = input.charAt(startCounter++);
                char backwardChar = input.charAt(endCounter--);
                if (forwardChar != backwardChar) {
                    return false;
                }
            }
        }
        return true;
    }

    public int containsPalindromes(String text){
        // Strips the text of all punctuation
        String clean = text.replaceAll("\\p{Punct}", "");
        // Splits the text into an array of strings
        String[] words = clean.split(" ");
        int paliCounter = 0;
        // For-each loop iterates through each item in words array and checks with logic from .isPalindrome method
        for (String word : words){
            if (isPalindrome(word)){
                paliCounter++;
            }
        }
        return paliCounter;

    }







    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        int test = checker.containsPalindromes("Anna, Hannah, Otto and Clive are going to a party.");
        System.out.println(test);
    }
}


