package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int nbrCages = 3; // Limite de 3 animaux pour tester l'exception
    private int animalCount = 0;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Le nom du zoo ne doit pas être vide.");
        }
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (animalCount >= nbrCages) {
            throw new ZooFullException("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
        }
        animals[animalCount++] = animal;
        System.out.println(animal.getClass().getSimpleName() + " ajouté au zoo.");
        System.out.println("Nombre d'animaux dans le zoo: " + animalCount);
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of cages: " + nbrCages);
    }
}
