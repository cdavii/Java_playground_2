package challenges.week_1.fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

    /*
    Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
    “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.

    Plan:
    - Print integers 1 to 100/n
    -- Manage a range
    - divisibleBy
    -- store data in Array / ArrayList - have to be strings - manage int into string
    - How will I output the outcome?
    */
    private boolean divisibleBy(int num, int divisibleNum) {
        return num % divisibleNum == 0;
    }


    public String[] fizzBuzzGenerator(int range) {
        String[] fizzBuzzArr = new String[range];

        for (int i = 0; i < fizzBuzzArr.length; i++) {
            if (divisibleBy(i + 1, 15)) {
                fizzBuzzArr[i] = "FizzBuzz";
            } else if (divisibleBy(i + 1, 3)) {
                fizzBuzzArr[i] = "Fizz";
            } else if (divisibleBy(i + 1, 5)) {
                fizzBuzzArr[i] = "Buzz";
            } else {
                fizzBuzzArr[i] = Integer.toString(i + 1);
            }
        }
        return fizzBuzzArr;
    }
}


