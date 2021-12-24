package oop.animal_farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalSanctuary {
    private Dog mac = new Dog();
    private Dog aston = new Dog();
    private Fox crackFox = new Fox();
    private Fox bill = new Fox();
    private List<Animal> animalsInTheSanctuary = new ArrayList<>();
    private List<Fox> foxesInTheSanctuary = new ArrayList<>();
    private List<Canine> caninesInTheSanctuary = new ArrayList<>();


    public AnimalSanctuary() {
        foxesInTheSanctuary.add(this.bill);
        foxesInTheSanctuary.add(this.crackFox);

        animalsInTheSanctuary.add(mac);
        animalsInTheSanctuary.add(crackFox);
        animalsInTheSanctuary.add(aston);

        caninesInTheSanctuary.add(mac);
        caninesInTheSanctuary.add(crackFox);


    }

    private void foxesInTheSanctuary(){

    }
}
