package be.cegeka.polymorfism.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    /**Before executing this main function, try to predict the output of this program.*/

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Dog("Max"));
        animalList.add(new Cat("Tom"));
        animalList.add(new Duck("Donald"));
        animalList.add(new Dog("Lacy"));

        for(Animal animal : animalList) {
            animal.printName();
            animal.printKind();
            animal.saySomething();
        }
    }
}
