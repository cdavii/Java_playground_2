package oop.animal_farm;

public class Dog extends Animal implements Canine{

    public Dog() {
        super(4);
    }

    @Override
    public String eat() {
        return "Dog food";
    }

    @Override
    public String sound() {
        return "Woof!";
    }


    @Override
    public String hunt() {
        return "I'm going hunting";
    }

    @Override
    public String run(String speed) {
        return speed;
    }

    @Override
    public String tricks(String trick) {
        return trick;
    }
}
