package challenges.week_4;

import java.io.*;
import java.util.*;

public class BufferedReaderChallenge {

    static ArrayList<String> words = new ArrayList<>();
    static Map<String, Integer> occurrences = new HashMap<>();

    static ArrayList<String> nouns = new ArrayList<>();
    static ArrayList<String> adjectives = new ArrayList<>();
    static ArrayList<String> pronouns = new ArrayList<>();
    static ArrayList<String> verbs = new ArrayList<>();
    static ArrayList<String> adverbs = new ArrayList<>();
    static ArrayList<String> prepositions = new ArrayList<>();

    static String title;

    public static void readFile(String fileLocation) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
            title = bufferedReader.readLine();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine() ){

                    words.addAll(Arrays.asList(line.toLowerCase().replaceAll("\\p{Punct}", "").replaceAll("”","").replaceAll("“","").replaceAll("’", "").split("\\s+")));
                    words.remove("");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readWordTypes() {
        try {
            BufferedReader nounReader = new BufferedReader(new FileReader("src/main/resources/english_nouns.txt"));
            BufferedReader adjectiveReader = new BufferedReader(new FileReader("src/main/resources/english_adjectives.txt"));
            BufferedReader pronounReader = new BufferedReader(new FileReader("src/main/resources/english_pronouns.txt"));
            BufferedReader verbReader = new BufferedReader(new FileReader("src/main/resources/english_verbs.txt"));
            BufferedReader adverbReader = new BufferedReader(new FileReader("src/main/resources/english_adverbs.txt"));
            BufferedReader prepositionReader = new BufferedReader(new FileReader("src/main/resources/english_prepositions.txt"));

            for (String line = nounReader.readLine(); line != null; line = nounReader.readLine() ){
                nouns.addAll(Arrays.asList(line));
            }
            for (String line = adjectiveReader.readLine(); line != null; line = adjectiveReader.readLine() ){
                adjectives.addAll(Arrays.asList(line));
            }
            for (String line = pronounReader.readLine(); line != null; line = pronounReader.readLine() ){
                pronouns.addAll(Arrays.asList(line));
            }
            for (String line = verbReader.readLine(); line != null; line = verbReader.readLine() ){
                verbs.addAll(Arrays.asList(line));
            }
            for (String line = adverbReader.readLine(); line != null; line = adverbReader.readLine() ){
                adverbs.addAll(Arrays.asList(line));
            }
            for (String line = prepositionReader.readLine(); line != null; line = prepositionReader.readLine() ){
                prepositions.addAll(Arrays.asList(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findDuplicates() {

        for (String word : words) {
            //System.out.println(word);
            if (occurrences.containsKey(word)) {
                occurrences.put(word, occurrences.get(word) + 1);
            } else {
                occurrences.put(word, 1);
            }
        }
    }

    public static void writeInfoToFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/java/challenges/week_4/challenge_output"));

            bufferedWriter.write("Title: " + title + "\n");
            bufferedWriter.write("Word count: " + words.size() + "\n");
            bufferedWriter.write("Unique words: " + occurrences.keySet().size() + "\n");


            bufferedWriter.write("\nOccurrences of each word: \n");

            for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
                String word = entry.getKey();
                Integer count = entry.getValue();
                try {
                    bufferedWriter.write(word + " " + count + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        readFile("src/main/resources/twas_the_night_before_christmas.txt");
        //readWordTypes();
        findDuplicates();
        writeInfoToFile();

        //System.out.println(title);
        //System.out.println(words);
        //System.out.println(occurrences);
        //occurrences.forEach((key, value) -> System.out.print(key + " " + value + "\n"));
    }
}
