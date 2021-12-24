package oop.animal_farm;

public class Fox extends Animal implements Canine{

    public Fox() {
        super(4);
    }

    @Override
    public String eat() {
        return "Anything, yum!";
    }

    @Override
    public String sound() {
        return "Ring-ding-ding-ding-dingeringeding!\nGering-ding-ding-ding-dingeringeding!\nGering-ding-ding-ding-dingeringeding";
    }

    public static void main(String[] args) {
        Fox bill = new Fox();
        System.out.println(bill.sound());
    }

    @Override
    public String hunt() {
        return "going through the bins";
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
