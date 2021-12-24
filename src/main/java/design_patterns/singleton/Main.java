package design_patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton sing1 = Singleton.getSingleton();
        Singleton sing2 = Singleton.getSingleton();


        System.out.println(sing1.hashCode());
        System.out.println(sing2.hashCode());

    }
}
