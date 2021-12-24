package challenges.week_1.challenge_2;

import java.util.Arrays;
import java.util.Comparator;

public class ChallengeTwo {
    public String wordSorter(String input)
    {
        String[] stringArray = input.split(" ");
        Arrays.sort(stringArray, Comparator.comparing(String::length));
        return String.join(" ", Arrays.asList(stringArray));
    }
}


