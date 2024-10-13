package tn.esprit.gestionzoo.entities;

public class Terrestrial {
    protected int nbrLegs;

    public Terrestrial(int nbrLegs) {
        setNbrLegs(nbrLegs);
    }

    public void setNbrLegs(int nbrLegs) {
        if (nbrLegs >= 0) {
            this.nbrLegs = nbrLegs;
        } else {
            throw new IllegalArgumentException("Le nombre de pattes ne peut pas être négatif.");
        }
    }
}
