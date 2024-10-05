package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Veuillez entrer le nom du zoo: ");
        String zooName = scanner.nextLine();

        System.out.println("Veuillez entrer la ville du zoo: ");
        String city = scanner.nextLine();


            Zoo myZoo = new Zoo(zooName, city);

            while (true) {
                System.out.println("Ajout d'un nouvel animal...");
                System.out.print("Entrez la famille de l'animal: ");
                String animalFamily = scanner.nextLine();

                System.out.print("Entrez le nom de l'animal: ");
                String animalName = scanner.nextLine();

                System.out.print("Entrez l'âge de l'animal: ");
                int animalAge = scanner.nextInt();

                System.out.print("Est-ce un mammifère ? (true/false): ");
                boolean isMammal = scanner.nextBoolean();
                scanner.nextLine();

                Animal animal = new Animal(animalFamily, animalName, animalAge, isMammal);

                boolean added = myZoo.addAnimal(animal);

                if (added) {
                    System.out.println(animalName + " a été ajouté au zoo.");
                } else {
                    System.out.println("Impossible d'ajouter " + animalName + " : animal déjà présent ou zoo plein.");
                }


                System.out.print("Voulez-vous ajouter un autre animal ? (oui/non): ");
                String response = scanner.nextLine();
                if (!response.equalsIgnoreCase("oui")) {
                    break;
                }
            }

            myZoo.displayAnimals();

    }
}
