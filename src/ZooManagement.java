package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Aquatic World", "Tunis");

        try {
            Dolphin dolphin1 = new Dolphin("Sea", "Dolphin1", 5, 30.0f);
            Penguin penguin1 = new Penguin("Arctic", "Penguin1", 4, 150.0f);
            Penguin penguin2 = new Penguin("Arctic", "Penguin2", 3, 200.0f);
            Penguin penguin3 = new Penguin("Arctic", "Penguin3", 2, 100.0f);

            // Adding animals to the zoo and catching potential exceptions
            myZoo.addAnimal(dolphin1);
            myZoo.addAnimal(penguin1);
            myZoo.addAnimal(penguin2);
            myZoo.addAnimal(penguin3); // This should throw ZooFullException

        } catch (ZooFullException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
