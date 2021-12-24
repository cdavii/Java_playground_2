package challenges.week_1.challenge_1;

public class ChallengeOne {
    public int challenge_1(){
        int counter = 0;
        int sum = 0;
        while (counter < 1000){
            if (counter % 3 == 0){
                sum += counter;
            } else if (counter % 5 == 0){
                sum += counter;
            }
        counter++;
        }
    return sum;
    }
}
