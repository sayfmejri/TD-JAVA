public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    final int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }

    public boolean addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                return true;
            }
        }
        return false;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                animals[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean isZooFull() {
        for (Animal animal : animals) {
            if (animal == null) {
                return false;
            }
        }
        return true;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        int countZ1 = 0;
        int countZ2 = 0;

        for (Animal animal : z1.animals) {
            if (animal != null) countZ1++;
        }

        for (Animal animal : z2.animals) {
            if (animal != null) countZ2++;
        }

        return countZ1 > countZ2 ? z1 : z2;
    }
}
