package design_patterns.factory;

public class AnimalFactory {
    public static Speakable getAnimal(String animal) {
        if ("dog".equals(animal)) {
            new Dog();
        } else if ("cat".equals(animal)) {
            new Cat();
        } else if ("goldfish".equals(animal)) {
            new Goldfish();
        }
    return null;
    }
}
