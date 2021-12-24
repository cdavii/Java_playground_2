package file_io;

import java.io.*;

public class FileIOExamples {

//    public static void printLines() {
//        String fileLocation = "src/main/resources/twas_the_night_before_christmas.txt";
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));
//
//            String line = bufferedReader.readLine();
//            while (line != null){
//                System.out.println(bufferedReader.readLine());
//                line = bufferedReader.readLine();
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void printAllLinesUsingForLoop(String fileLocation) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileLocation));

            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine() ){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("File not found");
        }
    }

    public static void writeToFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/main/resources/write_example.txt"));

            bufferedWriter.write("This is a new line");
            bufferedWriter.write("\nThis is a new line");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        printAllLinesUsingForLoop("src/main/resources/twas_the_night_before_christmas.txt");
        writeToFile();
    }

}
