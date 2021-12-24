package core.loops.while_loops;

public class WhileExamples {

    // An example of a basic while loop, outputs
    public void printNum(int printFrom){
        int count = printFrom;
        while (count != 0){
            System.out.println(count);
            count --;
        }
    }

    //Do-While will run at least once.
    public void doWhile(int printFrom){
        int count = printFrom;
        do{
            System.out.println(count);
            count --;
        } while (count != 0);
    }


}
