package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int nbrCages = 25;
    private int animalCount;


    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }


    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }
        animals[animalCount++] = animal;
        return true;
    }


    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }


    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[--animalCount] = null;
        return true;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount > z2.animalCount ? z1 : z2;
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

    public int getAnimalCount() {
        return animalCount;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of cages: " + nbrCages);
    }
}
