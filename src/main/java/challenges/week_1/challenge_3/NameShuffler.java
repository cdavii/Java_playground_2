package challenges.week_1.challenge_3;

public class NameShuffler {
    public String shuffler(String fullName){
        int spaceChar = fullName.indexOf(' ');
        String firstName = fullName.substring(0 , spaceChar);
        String lastName = fullName.substring(spaceChar + 1);
        return lastName + " " + firstName;
    }
}
