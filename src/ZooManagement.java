import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        nbrCages = scanner.nextInt();
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Zoo myZoo = new Zoo(zooName, "Paris", nbrCages);
        System.out.println(myZoo.name + " est situé à " + myZoo.city + " et comporte " + myZoo.nbrCages + " cages.");

        Animal tiger = new Animal("Felidae", "Tiger", 3, true);

        myZoo.displayZoo();
        System.out.println(myZoo);
    }
}
