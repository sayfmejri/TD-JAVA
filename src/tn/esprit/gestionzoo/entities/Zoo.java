package tn.esprit.gestionzoo.entities;


public class Zoo {
    private Animal[] animals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private static final int nbrCages = 25;
    private int animalCount = 0;
    private int aquaticCount = 0;

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

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount++] = aquatic;
            System.out.println(aquatic.getClass().getSimpleName() + " ajouté aux animaux aquatiques.");
        } else {
            System.out.println("Impossible d'ajouter plus d'animaux aquatiques : capacité maximale atteinte.");
        }
    }

    public void displayAllAquaticSwim() {
        System.out.println("Les animaux aquatiques du zoo sont en train de nager :");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name + ", City: " + city + ", Number of cages: " + nbrCages);
    }
}
