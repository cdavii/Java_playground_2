package static_final;

public class StaticExamples {
    public static String canYouSeeMe = "You can only see me at the class/object level";
    public String iAmAClassVar = "You can only see me when instantiated";


    public static void main(String[] args) {
        StaticExamples exampleObject = new StaticExamples();
        System.out.println(exampleObject.iAmAClassVar);
        System.out.println(StaticExamples.canYouSeeMe);
    }
}
