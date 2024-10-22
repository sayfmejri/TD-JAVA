package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Aquatic World", "Tunis");

        Dolphin dolphin1 = new Dolphin("Sea", "Dolphin1", 5, 30.0f);
        Penguin penguin1 = new Penguin("Arctic", "Penguin1", 4, 150.0f);
        Penguin penguin2 = new Penguin("Arctic", "Penguin2", 3, 200.0f);

        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);

        myZoo.displayAllAquaticSwim();
        System.out.println("Profondeur maximale de nage des pingouins : " + myZoo.maxPenguinSwimmingDepth() + " mètres.");
        myZoo.displayNumberOfAquaticsByType();
    }
}
